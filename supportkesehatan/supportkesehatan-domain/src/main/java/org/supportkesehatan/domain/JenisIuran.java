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
@Table(name = "jenis_iuran")
public class JenisIuran {
	
	@Id
	@Column(name = "id_jenis_iuran", length = 4, nullable = false)
	private String id;
	
	@Column(name = "nama_jenis_iuran", length = 30, nullable = false)
	private String nama;
	
	@Column(name = "besar_iuran", nullable = false)
	private int besar_iuran;
	
	@Column(name = "expired_date")
	private String expired_date;

	public JenisIuran(String id, String nama, int besar_iuran,
			String expired_date) {
		this.id = id;
		this.nama = nama;
		this.besar_iuran = besar_iuran;
		this.expired_date = expired_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getBesar_iuran() {
		return besar_iuran;
	}

	public void setBesar_iuran(int besar_iuran) {
		this.besar_iuran = besar_iuran;
	}

	public String getExpired_date() {
		return expired_date;
	}

	public void setExpired_date(String expired_date) {
		this.expired_date = expired_date;
	}
	
	
}
