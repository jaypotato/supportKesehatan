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
@Table(name = "rekam_medis")
public class RekamMedis {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "tanggal")
	private String tanggal;
	
	@Column(name = "diagnosa", length = 50)
	private String diagnosa;

	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public RekamMedis(UUID id, String tanggal, String diagnosa,
			DateTime create_date, DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.tanggal = tanggal;
		this.diagnosa = diagnosa;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public RekamMedis(UUID id, String tanggal, String diagnosa) {
		super();
		this.id = id;
		this.tanggal = tanggal;
		this.diagnosa = diagnosa;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getDiagnosa() {
		return diagnosa;
	}

	public void setDiagnosa(String diagnosa) {
		this.diagnosa = diagnosa;
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
	
	
}
