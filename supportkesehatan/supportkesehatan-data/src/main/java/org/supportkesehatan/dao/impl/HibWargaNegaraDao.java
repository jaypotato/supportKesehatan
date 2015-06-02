package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.WargaNegaraDao;
import org.supportkesehatan.domain.WargaNegara;

@Transactional
@Repository("wargaNegara")
public class HibWargaNegaraDao implements WargaNegaraDao {
	
	private SessionFactory sessionFactory;

	public HibWargaNegaraDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<WargaNegara> list() {
		List<WargaNegara> wargaNegara = this.getSessionFactory().getCurrentSession()
				.createQuery("from warga_negara").list();
		return wargaNegara;
	}

	public void add(WargaNegara wargaNegara) {
		this.getSessionFactory().getCurrentSession().save(wargaNegara);
	}

	public void edit(WargaNegara wargaNegara) {
		this.getSessionFactory().getCurrentSession().update(wargaNegara);
	}

	public void delete(WargaNegara wargaNegara) {
		this.getSessionFactory().getCurrentSession().delete(wargaNegara);
	}

	public WargaNegara findById(String id) {
		WargaNegara wargaNegara = (WargaNegara) this.getSessionFactory().getCurrentSession()
				.createQuery("from warga_negara w where w.unique_id_wn = :id").list();
		return wargaNegara;
	}

}
