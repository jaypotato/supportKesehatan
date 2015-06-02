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
@Table(name ="jenis_sarana")
public class JenisSarana {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_jenis_sarana", nullable = false)
	private String id;
	
	@Column(name = "nama_jenis_sarana", nullable = false)
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

	public JenisSarana(String id, String jenis, DateTime create_date,
			DateTime last_update, boolean soft_delete, DateTime expired_date) {
		this.id = id;
		this.jenis = jenis;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
		this.expired_date = expired_date;
	}
	public JenisSarana(String id, String jenis, DateTime create_date,
			DateTime expired_date) {
		this.id = id;
		this.jenis = jenis;
		this.create_date = create_date;
		this.expired_date = expired_date;
	}

	public JenisSarana(String id, String jenis) {
		super();
		this.id = id;
		this.jenis = jenis;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
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

	public DateTime getExpiredDate() {
		return expired_date;
	}

	public void setExpiredDate(DateTime expired_date) {
		this.expired_date = expired_date;
	}
	
}
