package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.JenisTenagaMedisDao;
import org.supportkesehatan.domain.JenisTenagaMedis;

@Transactional
@Repository("jenisTenagaMedis")
public class HibJenisTenagaMedisDao implements JenisTenagaMedisDao {

	private SessionFactory sessionFactory;
	
	public HibJenisTenagaMedisDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<JenisTenagaMedis> list() {
		List<JenisTenagaMedis> jenis = this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_tenaga_medis").list();
		return jenis;
	}

	public void add(JenisTenagaMedis jenisTenagaMedis) {
		this.getSessionFactory().getCurrentSession().save(jenisTenagaMedis);
	}

	public void edit(JenisTenagaMedis jenisTenagaMedis) {
		this.getSessionFactory().getCurrentSession().update(jenisTenagaMedis);
	}

	public void delete(JenisTenagaMedis jenisTenagaMedis) {
		this.getSessionFactory().getCurrentSession().delete(jenisTenagaMedis);
	}

	public JenisTenagaMedis findById(String id) {
		JenisTenagaMedis jenis = (JenisTenagaMedis) this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_tenaga_medis j where j.id_tenaga_medis = :id").list();
		return jenis;
	}

}
