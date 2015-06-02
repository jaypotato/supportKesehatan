package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.JenisSaranaDao;
import org.supportkesehatan.domain.JenisSarana;

@Transactional
@Repository("jenisSarana")
public class HibJenisSaranaDao implements JenisSaranaDao {

	private SessionFactory sessionFactory;
	
	public HibJenisSaranaDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<JenisSarana> list() {
		List<JenisSarana> jenis = this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_sarana").list();
		return jenis;
	}

	public void add(JenisSarana jenisSarana) {
		this.getSessionFactory().getCurrentSession().save(jenisSarana);
	}

	public void edit(JenisSarana jenisSarana) {
		this.getSessionFactory().getCurrentSession().update(jenisSarana);
	}

	public void delete(JenisSarana jenisSarana) {
		this.getSessionFactory().getCurrentSession().delete(jenisSarana);
	}

	public JenisSarana findById(String id) {
		JenisSarana jenis = (JenisSarana) this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_sarana j where j.id_jenis_sarana = :id").list();
		return jenis;
	}

}
