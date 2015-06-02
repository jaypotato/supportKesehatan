package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.JenisKepesertaanDao;
import org.supportkesehatan.domain.JenisKepesertaan;

@Transactional
@Repository("jenisKepesertaan")
public class HibJenisKepesertaanDao implements JenisKepesertaanDao {

private SessionFactory sessionFactory;
	
	public HibJenisKepesertaanDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<JenisKepesertaan> list() {
		List<JenisKepesertaan> jenis = this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_kepesertaan").list();
		return jenis;
	}

	public void add(JenisKepesertaan jenisKepesertaan) {
		this.getSessionFactory().getCurrentSession().save(jenisKepesertaan);
	}

	public void edit(JenisKepesertaan jenisKepesertaan) {
		this.getSessionFactory().getCurrentSession().update(jenisKepesertaan);
	}

	public void delete(JenisKepesertaan jenisKepesertaan) {
		this.getSessionFactory().getCurrentSession().delete(jenisKepesertaan);
	}

	public JenisKepesertaan findById(String id) {
		JenisKepesertaan jenis = (JenisKepesertaan) this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_kepesertaan j where j.id_jenis_kepesertaan = :id").list();
		return jenis;
	}

}
