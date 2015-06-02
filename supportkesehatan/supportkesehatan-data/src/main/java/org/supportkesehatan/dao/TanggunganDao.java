package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.Tanggungan;

public interface TanggunganDao {
	
	public List<Tanggungan> list();
	public void add(Tanggungan tanggungan);
	public void edit(Tanggungan tanggungan);
	public void delete(Tanggungan tanggungan);
	public Tanggungan findById(String id);
}
