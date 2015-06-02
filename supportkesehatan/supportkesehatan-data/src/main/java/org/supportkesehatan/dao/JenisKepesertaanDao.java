package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.JenisKepesertaan;

public interface JenisKepesertaanDao {

	public List<JenisKepesertaan> list();
	public void add(JenisKepesertaan jenisKepesertaan);
	public void edit(JenisKepesertaan jenisKepesertaan);
	public void delete(JenisKepesertaan jenisKepesertaan);
	public JenisKepesertaan findById(String id);
}
