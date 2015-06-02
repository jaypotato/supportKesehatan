package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.KTP;

public interface KTPDao {

	public List<KTP> list();
	public void add(KTP ktp);
	public void edit(KTP ktp);
	public void delete(KTP ktp);
	public KTP findById(String id);
}
