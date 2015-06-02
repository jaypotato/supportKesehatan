package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.KlaimDao;
import org.supportkesehatan.domain.KlaimAnggaran;

@Transactional
@Repository("klaimAnggaran")
public class HibKlaimDao implements KlaimDao {
	
	private SessionFactory sessionFactory;

	public HibKlaimDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<KlaimAnggaran> list() {
		List<KlaimAnggaran> klaim = this.getSessionFactory().getCurrentSession()
				.createQuery("from klaim_anggaran").list();
		return klaim;
	}

	public void add(KlaimAnggaran klaim) {
		this.getSessionFactory().getCurrentSession().save(klaim);
	}

	public void edit(KlaimAnggaran klaim) {
		this.getSessionFactory().getCurrentSession().update(klaim);
	}

	public void delete(KlaimAnggaran klaim) {
		this.getSessionFactory().getCurrentSession().delete(klaim);
	}

	public KlaimAnggaran findById(String id) {
		KlaimAnggaran klaim = (KlaimAnggaran) this.getSessionFactory().getCurrentSession()
				.createQuery("from klaim_anggaran k where k.id_klaim = :id").list();
		return klaim;
	}

}
