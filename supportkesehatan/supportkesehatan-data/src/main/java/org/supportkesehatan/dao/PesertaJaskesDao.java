package org.supportkesehatan.dao;

import org.supportkesehatan.domain.PesertaJaskes;

import java.util.List;
import java.util.UUID;

public interface PesertaJaskesDao {

	public List<PesertaJaskes> list();
	public void add(PesertaJaskes peserta);
	public void edit(PesertaJaskes peserta);
	public void delete(PesertaJaskes peserta);
	public PesertaJaskes findById(UUID id);
	public List<PesertaJaskes> findByName(String name);
	public List<PesertaJaskes> findByWilayah(UUID wilayah);
}
