package org.supportkesehatan.services.impl;

import java.util.List;

import org.supportkesehatan.dao.PesertaJaskesDao;
import org.supportkesehatan.domain.PesertaJaskes;
import org.supportkesehatan.services.PesertaJaskesService;

public class PesertaJaskesImpl implements PesertaJaskesService{

	private PesertaJaskesDao pesertaDao;

	public List<PesertaJaskes> list() {
		
		return this.pesertaDao.list();
	}

	public void createAccount(PesertaJaskes newPesJaskes) {
		this.pesertaDao.add(newPesJaskes);
		
	}
	
	
}
