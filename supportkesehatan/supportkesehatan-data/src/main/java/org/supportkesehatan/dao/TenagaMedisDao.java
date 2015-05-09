package org.supportkesehatan.dao;

import org.supportkesehatan.domain.TenagaMedis;
import java.util.List;
import java.util.UUID;

public interface TenagaMedisDao {

	public void add(TenagaMedis tenagaMedis);
	public void delete(TenagaMedis tenagaMedis);
	public void edit (TenagaMedis tenagaMedis);
	public TenagaMedis findById (UUID id);
	//public List<TenagaMedis> findBy 
}
