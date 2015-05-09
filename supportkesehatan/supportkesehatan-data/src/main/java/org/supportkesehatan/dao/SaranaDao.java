package org.supportkesehatan.dao;

import org.supportkesehatan.domain.SaranaKesehatan;

import java.util.List;
import java.util.UUID;

public interface SaranaDao {

	public void add(SaranaKesehatan sarana);
	public void edit(SaranaKesehatan sarana);
	public void delete(SaranaKesehatan sarana);
	public List<SaranaKesehatan> findByWilayah(UUID wilayah);
	public SaranaKesehatan findById(UUID Id);
}
