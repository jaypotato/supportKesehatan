package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.KK;

public interface KKDao {
	
	public List<KK> list();
	public void add(KK kartuKeluarga);
	public void edit(KK kartuKeluarga);
	public void delete(KK kartuKeluarga);
	public KK findById(String id);
}
