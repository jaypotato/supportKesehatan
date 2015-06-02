package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.JenisIuranDao;
import org.supportkesehatan.domain.JenisIuran;

@Transactional
@Repository("jenisIuran")
public class HibJenisIuranDao implements JenisIuranDao {
	
	private SessionFactory sessionFactory;
	
	public HibJenisIuranDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<JenisIuran> list() {
		List<JenisIuran> jenis = this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_iuran").list();
		return jenis;
	}

	public void add(JenisIuran jenisIuran) {
		this.getSessionFactory().getCurrentSession().save(jenisIuran);
	}

	public void edit(JenisIuran jenisIuran) {
		this.getSessionFactory().getCurrentSession().update(jenisIuran);
	}

	public void delete(JenisIuran jenisIuran) {
		this.getSessionFactory().getCurrentSession().delete(jenisIuran);
	}

	public JenisIuran findById(String id) {
		JenisIuran jenis = (JenisIuran) this.getSessionFactory().getCurrentSession()
				.createQuery("from jenis_iuran j where j.id_jenis_iuran = :id").list();
		return jenis;
	}

}
