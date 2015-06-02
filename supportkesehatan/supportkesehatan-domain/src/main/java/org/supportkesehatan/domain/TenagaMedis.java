package org.supportkesehatan.domain;


import java.util.UUID;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "tenaga_medis")
public class TenagaMedis 
{
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_tenaga_medis", nullable = false)
	private String id;
	
	@Column(name = "id_jenis_tenaga_medis", nullable = false)
	private String id_jenis_tenaga_medis;
	
	@Column(name = "nama_tenaga_medis", length = 30, nullable = false)
	private String nama;
	
	@Column(name = "alamat_tenaga_medis", length = 50, nullable = false)
	private String alamat;
	
	@Column(name = "no_telp", length = 15, nullable=false)
	private String no_telp;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public TenagaMedis(){
	}
	
	public TenagaMedis(String id_tenaga_kesehatan, String nama,
			String alamat, String tempat_lahir, String tanggal_lahir,
			String no_telp, boolean soft_delete, DateTime create_date,
			DateTime last_update) {
		this.id = id_tenaga_kesehatan;
		this.nama = nama;
		this.alamat = alamat;
		this.no_telp = no_telp;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public TenagaMedis(String id_tenaga_kesehatan, 
			String id_jenis_tenaga_medis, String nama,
			String alamat, String tempat_lahir, String tanggal_lahir,
			String no_telp, boolean soft_delete, DateTime create_date,
			DateTime last_update) {
		this.id = id_tenaga_kesehatan;
		this.id_jenis_tenaga_medis = id_jenis_tenaga_medis;
		this.nama = nama;
		this.alamat = alamat;
		this.no_telp = no_telp;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdJenisTenagaMedis() {
		return id_jenis_tenaga_medis;
	}

	public void setIdJenisTenagaMedis(String id) {
		this.id_jenis_tenaga_medis = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return no_telp;
	}

	public void setNoTelp(String no_telp) {
		this.no_telp = no_telp;
	}

	public boolean getSoftDelete() {
		return soft_delete;
	}

	public void setSoftDelete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getCreateDate() {
		return create_date;
	}

	public void setCreateDate(DateTime create_date) {
		this.create_date = create_date;
	}

	public DateTime getLastUpdate() {
		return last_update;
	}

	public void setLastUpdate(DateTime last_update) {
		this.last_update = last_update;
	}
	
}


