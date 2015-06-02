package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.JenisTenagaMedis;

public interface JenisTenagaMedisDao {

	public List<JenisTenagaMedis> list();
	public void add(JenisTenagaMedis jenisTenagaMedis);
	public void edit(JenisTenagaMedis jenisTenagaMedis);
	public void delete(JenisTenagaMedis jenisTenagaMedis);
	public JenisTenagaMedis findById(String id);
}
