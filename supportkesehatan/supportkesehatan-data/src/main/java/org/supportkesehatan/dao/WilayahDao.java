package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.Wilayah;

public interface WilayahDao {

	public List<Wilayah> list();
	public void add(Wilayah wilayah);
	public void edit(Wilayah wilayah);
	public void delete(Wilayah wilayah);
	public Wilayah findById(String id);
}
