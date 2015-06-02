package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.RekamMedis;

public interface RekamMedisDao {
	
	public List<RekamMedis> list();
	public void add(RekamMedis rekamMedis);
	public void edit(RekamMedis rekamMedis);
	public void delete(RekamMedis rekamMedis);
	public RekamMedis findById(String id);
}
