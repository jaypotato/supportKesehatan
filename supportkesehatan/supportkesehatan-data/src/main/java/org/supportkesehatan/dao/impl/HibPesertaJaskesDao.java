package org.supportkesehatan.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.domain.PesertaJaskes;
import org.supportkesehatan.dao.PesertaJaskesDao;

@Transactional
@Repository("pesertaJaskes")
public class HibPesertaJaskesDao implements PesertaJaskesDao {

	private SessionFactory sessionFactory;

	public HibPesertaJaskesDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional(readOnly = true)
	public List<PesertaJaskes> list() {
		List<PesertaJaskes> peserta = this.getSessionFactory().getCurrentSession()
				.createQuery("from peserta_jaskes").list();
		return peserta;
	}

	public void add(PesertaJaskes peserta) {
		this.getSessionFactory().getCurrentSession().save(peserta);
	}

	public void edit(PesertaJaskes peserta) {
		// TODO Auto-generated method stub
	}

	public void delete(PesertaJaskes peserta) {
		this.getSessionFactory().getCurrentSession().delete(peserta);

	}

	public PesertaJaskes findById(UUID id) {
		PesertaJaskes peserta = (PesertaJaskes) this.getSessionFactory().getCurrentSession()
				.createQuery("from peserta_jaskes j where j.id = :id")
				.list();
		return peserta;
	}
    
	@Transactional
	public List<PesertaJaskes> findByName(String name) {
		List<PesertaJaskes> peserta = this.getSessionFactory().getCurrentSession()
				.createQuery("from peserta_jaskes j where nama = '"+name+"'").list();
		return peserta;
	}

	public List<PesertaJaskes> findByWilayah(UUID wilayah) {
		// TODO Auto-generated method stub
		return null;
	}

}
