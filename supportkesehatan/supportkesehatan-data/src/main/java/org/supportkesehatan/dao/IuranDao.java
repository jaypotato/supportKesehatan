package org.supportkesehatan.dao;

import org.supportkesehatan.domain.IuranPeserta;
import java.util.List;

public interface IuranDao {

	public void bayarIuran(IuranPeserta iuran);
	public List<IuranPeserta> findByBulan(String bulan);
	public List<IuranPeserta> findByTahun(int tahun);
}
