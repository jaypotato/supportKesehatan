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
@Table(name = "wilayah")
public class Wilayah {

	@Id
	//@GeneratedValue(generator = "uuid2")
	//@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_wilayah", nullable = false)
	private int id;
	
	@Column(name = "wil_id_wilayah", nullable = false)
	private int id2;
	
	@Column(name= "id_level_wilayah", nullable = false)
	private int id_level;
	
	@Column(name = "nama_wilayah", nullable = false)
	private String nama;
	
	@Column(name = "expired_date", nullable= true)
	private DateTime expired_date;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public Wilayah(int id, int id2, int id_level, String nama,
			DateTime expired_date, boolean soft_delete, DateTime create_date,
			DateTime last_update) {
		super();
		this.id = id;
		this.id2 = id2;
		this.id_level = id_level;
		this.nama = nama;
		this.expired_date = expired_date;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public int getIdLevel() {
		return id_level;
	}

	public void setIdLevel(int id_level) {
		this.id_level = id_level;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public DateTime getExpiredDate() {
		return expired_date;
	}

	public void setExpiredDate(DateTime expired_date) {
		this.expired_date = expired_date;
	}

	public boolean isSoftDelete() {
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
