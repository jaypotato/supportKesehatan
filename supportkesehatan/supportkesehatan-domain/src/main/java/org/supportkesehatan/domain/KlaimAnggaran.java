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
@Table(name ="klaim_anggaran")
public class KlaimAnggaran {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_klaim")
	private UUID id;
	
	@Column(name = "nama_klaim", length = 30, nullable = false)
	private String nama;
	
	@Column(name = "tanggal_klaim")
	private String tanggal;
	
	@Column(name = "besar_klaim")
	private int besar;
	
	@Column(name = "penjelasan")
	private String penjelasan;

	public KlaimAnggaran(UUID id, String nama, String tanggal, int besar,
			String penjelasan) {
		super();
		this.id = id;
		this.nama = nama;
		this.tanggal = tanggal;
		this.besar = besar;
		this.penjelasan = penjelasan;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public int getBesar() {
		return besar;
	}

	public void setBesar(int besar) {
		this.besar = besar;
	}

	public String getPenjelasan() {
		return penjelasan;
	}

	public void setPenjelasan(String penjelasan) {
		this.penjelasan = penjelasan;
	}
	
	
}
