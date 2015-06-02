package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.KTPDao;
import org.supportkesehatan.domain.KTP;

@Transactional
@Repository("ktp")
public class HibKTPDao implements KTPDao {
	
	private SessionFactory sessionFactory;

	public HibKTPDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<KTP> list() {
		List<KTP> ktp = this.getSessionFactory().getCurrentSession()
				.createQuery("from ktp").list();
		return ktp;
	}

	public void add(KTP ktp) {
		this.getSessionFactory().getCurrentSession().save(ktp);
	}

	public void edit(KTP ktp) {
		this.getSessionFactory().getCurrentSession().update(ktp);
	}

	public void delete(KTP ktp) {
		this.getSessionFactory().getCurrentSession().delete(ktp);
	}

	public KTP findById(String id) {
		KTP ktp = (KTP) this.getSessionFactory().getCurrentSession()
				.createQuery("from ktp k where k.nomor_reg_ktp = :id").list();
		return ktp;
	}

}
