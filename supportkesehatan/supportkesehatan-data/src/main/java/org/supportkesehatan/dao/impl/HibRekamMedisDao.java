package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.RekamMedisDao;
import org.supportkesehatan.domain.RekamMedis;

@Transactional
@Repository("rekamMedis")
public class HibRekamMedisDao implements RekamMedisDao {

	private SessionFactory sessionFactory;

	public HibRekamMedisDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<RekamMedis> list() {
		List<RekamMedis> rekamMedis = this.getSessionFactory().getCurrentSession()
				.createQuery("from rekam_medis").list();
		return rekamMedis;
	}

	public void add(RekamMedis rekamMedis) {
		this.getSessionFactory().getCurrentSession().save(rekamMedis);
	}

	public void edit(RekamMedis rekamMedis) {
		this.getSessionFactory().getCurrentSession().update(rekamMedis);
	}

	public void delete(RekamMedis rekamMedis) {
		this.getSessionFactory().getCurrentSession().delete(rekamMedis);
	}

	public RekamMedis findById(String id) {
		RekamMedis rekamMedis = (RekamMedis) this.getSessionFactory().getCurrentSession()
				.createQuery("from rekam_medis r where r.id_rekam_medis = :id").list();
		return rekamMedis;
	}

}
