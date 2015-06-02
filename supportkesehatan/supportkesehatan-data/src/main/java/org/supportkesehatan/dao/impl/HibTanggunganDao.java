package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.TanggunganDao;
import org.supportkesehatan.domain.Tanggungan;

@Transactional
@Repository("tanggungan")
public class HibTanggunganDao implements TanggunganDao {
	
	private SessionFactory sessionFactory;

	public HibTanggunganDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<Tanggungan> list() {
		List<Tanggungan> tanggungan = this.getSessionFactory().getCurrentSession()
				.createQuery("from tanggungan").list();
		return tanggungan;
	}

	public void add(Tanggungan tanggungan) {
		this.getSessionFactory().getCurrentSession().save(tanggungan);
	}

	public void edit(Tanggungan tanggungan) {
		this.getSessionFactory().getCurrentSession().update(tanggungan);
	}

	public void delete(Tanggungan tanggungan) {
		this.getSessionFactory().getCurrentSession().delete(tanggungan);
	}

	public Tanggungan findById(String id) {
		Tanggungan tanggungan = (Tanggungan) this.getSessionFactory().getCurrentSession()
				.createQuery("from tanggungan t where t.id_tanggungan = :id").list();
		return tanggungan;
	}

}
