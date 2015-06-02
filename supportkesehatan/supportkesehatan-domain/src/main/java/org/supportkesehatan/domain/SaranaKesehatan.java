package org.supportkesehatan.domain;

import java.util.UUID;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sarana_kesehatan")
public class SaranaKesehatan {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_sarana", nullable = false)
	private String id;
	
	@Column(name = "id_jenis_sarana", nullable = false)
	private String id_jenis_sarana;
	
	@Column(name = "id_wilayah", nullable = false)
	private int id_wilayah;

	@Column(name = "nama_sarana", nullable = false)
	private String nama;

	@Column(name = "alamat_sarana", nullable = false)
	private String alamat;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;

	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public SaranaKesehatan(String id, String nama, String alamat,
			DateTime create_date, DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}
	
	public SaranaKesehatan(String id, String id_jenis_sarana, 
			int id_wilayah, String nama, String alamat,
			DateTime create_date, DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.id_jenis_sarana = id_jenis_sarana;
		this.id_wilayah = id_wilayah;
		this.nama = nama;
		this.alamat = alamat;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public SaranaKesehatan(String id, String nama, String alamat) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdJenisSarana() {
		return id_jenis_sarana;
	}

	public void setIdJenisSarana(String id) {
		this.id_jenis_sarana = id;
	}
	
	public int getIdWilayah() {
		return id_wilayah;
	}

	public void setIdWilayah(int id) {
		this.id_wilayah = id;
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

	public boolean isSoftDelete() {
		return soft_delete;
	}

	public void setSoftDelete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

}
