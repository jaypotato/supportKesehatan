package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.WilayahDao;
import org.supportkesehatan.domain.Wilayah;

@Transactional
@Repository("wilayah")
public class HibWilayahDao implements WilayahDao {

	private SessionFactory sessionFactory;

	public HibWilayahDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<Wilayah> list() {
		List<Wilayah> wilayah = this.getSessionFactory().getCurrentSession()
				.createQuery("from wilayah").list();
		return wilayah;
	}

	public void add(Wilayah wilayah) {
		this.getSessionFactory().getCurrentSession().save(wilayah);
	}

	public void edit(Wilayah wilayah) {
		this.getSessionFactory().getCurrentSession().update(wilayah);
	}

	public void delete(Wilayah wilayah) {
		this.getSessionFactory().getCurrentSession().delete(wilayah);
	}

	public Wilayah findById(String id) {
		Wilayah wilayah = (Wilayah) this.getSessionFactory().getCurrentSession()
				.createQuery("from wilayah w where w.id_wilayah = :id").list();
		return wilayah;
	}

}
