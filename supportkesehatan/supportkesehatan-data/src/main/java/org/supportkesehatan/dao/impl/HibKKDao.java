package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.KKDao;
import org.supportkesehatan.domain.KK;

@Transactional
@Repository("kk")
public class HibKKDao implements KKDao {

	private SessionFactory sessionFactory;

	public HibKKDao () {
		
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<KK> list() {
		List<KK> kartuKeluarga = this.getSessionFactory().getCurrentSession()
				.createQuery("from kk").list();
		return kartuKeluarga;
	}

	public void add(KK kartuKeluarga) {
		this.getSessionFactory().getCurrentSession().save(kartuKeluarga);
	}

	public void edit(KK kartuKeluarga) {
		this.getSessionFactory().getCurrentSession().update(kartuKeluarga);
	}

	public void delete(KK kartuKeluarga) {
		this.getSessionFactory().getCurrentSession().delete(kartuKeluarga);
	}

	public KK findById(String id) {
		KK kartuKeluarga = (KK) this.getSessionFactory().getCurrentSession()
				.createQuery("from KK k where k.id_kk = :id").list();
		return kartuKeluarga;
	}

}
