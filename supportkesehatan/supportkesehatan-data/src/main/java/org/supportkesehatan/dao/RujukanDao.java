package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.SuratRujukan;;

public interface RujukanDao {
	
	public List<SuratRujukan> list();
	public void add(SuratRujukan rujukan);
	public void edit(SuratRujukan rujukan);
	public void delete(SuratRujukan rujukan);
	public SuratRujukan findById(String id);

}
