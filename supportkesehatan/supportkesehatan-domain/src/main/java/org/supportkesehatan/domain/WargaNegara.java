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
@Table(name = "warga_negara")
public class WargaNegara {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "unique_id_wn")
	private UUID id;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "tempat_lahir")
	private String tempatlahir;
	
	@Column(name = "tanggal_lahir")
	private String tanggal_lahir;
	
	@Column(name = "jenis_kelamin")
	private char jk;
	
	@Column(name = "gol_darah")
	private String gol_darah;
	
	@Column(name = "status_hidup")
	private boolean status_hidup;
	
	@Column(name = "status_hub_keluarga")
	private char status_keluarga;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public WargaNegara(UUID id, String nama, String tempatlahir,
			String tanggal_lahir, char jk, String gol_darah,
			boolean status_hidup, char status_keluarga, boolean soft_delete,
			DateTime create_date, DateTime last_update) {
		super();
		this.id = id;
		this.nama = nama;
		this.tempatlahir = tempatlahir;
		this.tanggal_lahir = tanggal_lahir;
		this.jk = jk;
		this.gol_darah = gol_darah;
		this.status_hidup = status_hidup;
		this.status_keluarga = status_keluarga;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTempatlahir() {
		return tempatlahir;
	}

	public void setTempatlahir(String tempatlahir) {
		this.tempatlahir = tempatlahir;
	}

	public String getTanggal_lahir() {
		return tanggal_lahir;
	}

	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}

	public char getJk() {
		return jk;
	}

	public void setJk(char jk) {
		this.jk = jk;
	}

	public String getGol_darah() {
		return gol_darah;
	}

	public void setGol_darah(String gol_darah) {
		this.gol_darah = gol_darah;
	}

	public boolean isStatus_hidup() {
		return status_hidup;
	}

	public void setStatus_hidup(boolean status_hidup) {
		this.status_hidup = status_hidup;
	}

	public char getStatus_keluarga() {
		return status_keluarga;
	}

	public void setStatus_keluarga(char status_keluarga) {
		this.status_keluarga = status_keluarga;
	}

	public boolean isSoft_delete() {
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
