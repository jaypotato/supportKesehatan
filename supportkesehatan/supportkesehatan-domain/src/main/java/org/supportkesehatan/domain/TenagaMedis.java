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
	@Column(name = "id_tenaga_medis")
	private UUID id;
	
	@Column(name = "nama", length = 30, nullable = false)
	private String nama;
	
	@Column(name = "alamat", length = 50, nullable = false)
	private String alamat;
	
	@Column(name = "tempat_lahir", length = 30, nullable = false)
	private String tempat_lahir;
	
	@Column(name = "tanggal_lahir", length = 10, nullable = false)
	private String tanggal_lahir;
	
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
	
	public TenagaMedis(UUID id_tenaga_kesehatan, String nama,
			String alamat, String tempat_lahir, String tanggal_lahir,
			String no_telp, boolean soft_delete, DateTime create_date,
			DateTime last_update) {
		this.id = id_tenaga_kesehatan;
		this.nama = nama;
		this.alamat = alamat;
		this.tempat_lahir = tempat_lahir;
		this.tanggal_lahir = tanggal_lahir;
		this.no_telp = no_telp;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}



	public UUID getId_tenaga_kesehatan() {
		return id;
	}

	public void setId_tenaga_kesehatan(UUID id_tenaga_kesehatan) {
		this.id = id_tenaga_kesehatan;
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

	public String getTempat_lahir() {
		return tempat_lahir;
	}

	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}

	public String getTanggal_lahir() {
		return tanggal_lahir;
	}

	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}

	public String getNo_telp() {
		return no_telp;
	}

	public void setNo_telp(String no_telp) {
		this.no_telp = no_telp;
	}

	public boolean getSoft_delete() {
		return soft_delete;
	}

	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getCreate_date() {
		return create_date;
	}

	public void setCreate_date(DateTime create_date) {
		this.create_date = create_date;
	}

	public DateTime getLast_update() {
		return last_update;
	}

	public void setLast_update(DateTime last_update) {
		this.last_update = last_update;
	}
	
}


