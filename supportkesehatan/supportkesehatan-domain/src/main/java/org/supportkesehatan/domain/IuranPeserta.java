package org.supportkesehatan.domain;

import java.util.UUID;
import java.util.Date;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "iuran_peserta")
public class IuranPeserta {

	@Id
	@Column(name = "id_iuran", length = 8, nullable = false)
	private String id;

	@Column(name = " bulan", length = 15, nullable = false)
	private String bulan;

	@Column(name = "tahun", nullable = false)
	private int tahun;

	@Column(name = "tanggal_pembayaran", nullable = false)
	private String tangal_pembayaran;

	/*
	@Column(name = "jenis_iuran", length = 20)
	private String jenis_iuran;

	@Column(name = "besar_iuran", nullable = false)
	private int besar_iuran;
	*/
	
	public IuranPeserta() {
	}

	public IuranPeserta(String id_iuran, String bulan, int tahun,
			String tangal_pembayaran){//, String jenis_iuran) {
		this.id = id_iuran;
		this.bulan = bulan;
		this.tahun = tahun;
		this.tangal_pembayaran = tangal_pembayaran;
		//this.jenis_iuran = jenis_iuran;
	}

	public String getId_iuran() {
		return id;
	}

	public void setId_iuran(String id_iuran) {
		this.id = id_iuran;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	public String getTangal_pembayaran() {
		return tangal_pembayaran;
	}

	public void setTangal_pembayaran(String tangal_pembayaran) {
		this.tangal_pembayaran = tangal_pembayaran;
	}

	/*
	public String getJenis_iuran() {
		return jenis_iuran;
	}

	public void setJenis_iuran(String jenis_iuran) {
		this.jenis_iuran = jenis_iuran;
	}
	 */
}
