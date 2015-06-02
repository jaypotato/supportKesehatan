package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.dao.RujukanDao;
import org.supportkesehatan.domain.SuratRujukan;

@Transactional
@Repository("suratRujukan")
public class HibRujukanDao implements RujukanDao {

	private SessionFactory sessionFactory;

	public HibRujukanDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<SuratRujukan> list() {
		List<SuratRujukan> rujukan = this.getSessionFactory().getCurrentSession()
				.createQuery("from surat_rujukan").list();
		return rujukan;
	}

	public void add(SuratRujukan rujukan) {
		this.getSessionFactory().getCurrentSession().save(rujukan);
	}

	public void edit(SuratRujukan rujukan) {
		this.getSessionFactory().getCurrentSession().update(rujukan);
	}

	public void delete(SuratRujukan rujukan) {
		this.getSessionFactory().getCurrentSession().delete(rujukan);
	}

	public SuratRujukan findById(String id) {
		SuratRujukan rujukan = (SuratRujukan) this.getSessionFactory().getCurrentSession()
				.createQuery("from surat_rujukan s where s.id_surat_rujukan = :id");
		return rujukan;
	}

}
