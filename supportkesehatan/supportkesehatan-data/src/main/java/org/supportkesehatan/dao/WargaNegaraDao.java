package org.supportkesehatan.dao;

import java.util.List;
import java.util.UUID;

import org.supportkesehatan.domain.WargaNegara;;

public interface WargaNegaraDao {

	public List<WargaNegara> list();
	public void add(WargaNegara wargaNegara);
	public void edit(WargaNegara wargaNegara);
	public void delete(WargaNegara wargaNegara);
	public WargaNegara findById(String id);
}
