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
@Table(name = "tanggungan")
public class Tanggungan {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "kepala_keluarga")
	private boolean kepala_keluarga;
	
	@Column(name = "hubungan_keluarga", length = 25)
	private String hubungan_keluarga;
	
	@Column(name = "jenis_kelamin")
	private char jk;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public Tanggungan(UUID id, boolean kepala_keluarga,
			String hubungan_keluarga, char jk, DateTime create_date,
			DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.kepala_keluarga = kepala_keluarga;
		this.hubungan_keluarga = hubungan_keluarga;
		this.jk = jk;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public Tanggungan(UUID id, boolean kepala_keluarga,
			String hubungan_keluarga, char jk) {
		super();
		this.id = id;
		this.kepala_keluarga = kepala_keluarga;
		this.hubungan_keluarga = hubungan_keluarga;
		this.jk = jk;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public boolean isKepala_keluarga() {
		return kepala_keluarga;
	}

	public void setKepala_keluarga(boolean kepala_keluarga) {
		this.kepala_keluarga = kepala_keluarga;
	}

	public String getHubungan_keluarga() {
		return hubungan_keluarga;
	}

	public void setHubungan_keluarga(String hubungan_keluarga) {
		this.hubungan_keluarga = hubungan_keluarga;
	}

	public char getJk() {
		return jk;
	}

	public void setJk(char jk) {
		this.jk = jk;
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
