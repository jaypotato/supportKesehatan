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
@Table(name = "kk")
public class KK {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_kk", nullable = false)
	private String id_kk;
	
	@Column(name = "nomor_kk", nullable = false)
	private String nomorKK;

	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public KK(String nomorKK, DateTime create_date, DateTime last_update,
			boolean soft_delete) {
		super();
		this.nomorKK = nomorKK;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}
	
	public KK(String id_kk, String nomorKK, DateTime create_date, DateTime last_update,
			boolean soft_delete) {
		super();
		this.id_kk = id_kk;
		this.nomorKK = nomorKK;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public KK(String nomorKK) {
		super();
		this.nomorKK = nomorKK;
	}
	
	public String getIdKK() {
		return id_kk;
	}

	public void setIdKK(String id) {
		this.id_kk = id;
	}

	public String getNomorKK() {
		return nomorKK;
	}

	public void setNomorKK(String nomorKK) {
		this.nomorKK = nomorKK;
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
