package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.KlaimAnggaran;

public interface KlaimDao {
	
	public List<KlaimAnggaran> list();
	public void add(KlaimAnggaran klaim);
	public void edit(KlaimAnggaran klaim);
	public void delete(KlaimAnggaran klaim);
	public KlaimAnggaran findById(String id);
}
