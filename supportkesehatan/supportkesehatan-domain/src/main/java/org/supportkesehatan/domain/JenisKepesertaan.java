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
@Table(name = "jenis_kepesertaan")
public class JenisKepesertaan {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_jenis_kepesertaan")
	private UUID id;
	
	@Column(name = "nama_jenis_kepesertaan", length = 30, nullable = false)
	private String jenis;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;
	
	@Column(name = "expired_date")
	private DateTime expired_date;

	public JenisKepesertaan(UUID id, String jenis, DateTime create_date,
			DateTime last_update, boolean soft_delete, DateTime expired_date) {
		this.id = id;
		this.jenis = jenis;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
		this.expired_date = expired_date;
	}

	public JenisKepesertaan(UUID id, String jenis) {
		super();
		this.id = id;
		this.jenis = jenis;
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
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

	public boolean isSoft_delete() {
		return soft_delete;
	}

	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getExpired_date() {
		return expired_date;
	}

	public void setExpired_date(DateTime expired_date) {
		this.expired_date = expired_date;
	}
	
	
}
