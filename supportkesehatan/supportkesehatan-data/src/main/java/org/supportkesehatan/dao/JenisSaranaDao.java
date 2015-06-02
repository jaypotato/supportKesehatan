package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.JenisSarana;

public interface JenisSaranaDao {

	public List<JenisSarana> list();
	public void add(JenisSarana jenisSarana);
	public void edit(JenisSarana jenisSarana);
	public void delete(JenisSarana jenisSarana);
	public JenisSarana findById(String id);
}
