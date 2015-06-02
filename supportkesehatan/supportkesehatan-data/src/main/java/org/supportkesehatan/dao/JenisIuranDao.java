package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.JenisIuran;

public interface JenisIuranDao {

	public List<JenisIuran> list();
	public void add(JenisIuran jenisIuran);
	public void edit(JenisIuran jenisIuran);
	public void delete(JenisIuran jenisIuran);
	public JenisIuran findById(String id);
}
