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
	@Column(name = "id_tanggungan", nullable = false)
	private String id;
	
	@Column(name = "id_peserta_penanggung", nullable = false)
	private String id_peserta_penanggung;
	
	@Column(name = "id_peserta_ditanggung", nullable = false)
	private String id_peserta_ditanggung;

	
	@Column(name = "kepala_keluarga", nullable = false)
	private boolean kepala_keluarga;
	
	@Column(name = "hubungan_keluarga", length = 25)
	private String hubungan_keluarga;
	
	@Column(name = "jenis_kelamin", nullable = false)
	private char jk;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public Tanggungan(String id, boolean kepala_keluarga,
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

	public Tanggungan(String id, boolean kepala_keluarga,
			String hubungan_keluarga, char jk) {
		super();
		this.id = id;
		this.kepala_keluarga = kepala_keluarga;
		this.hubungan_keluarga = hubungan_keluarga;
		this.jk = jk;
	}
	
	public Tanggungan(String id, String id_penanggung,
			String id_ditanggung, boolean kepala_keluarga,
			String hubungan_keluarga, char jk, DateTime create_date,
			DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.id_peserta_penanggung = id_penanggung;
		this.id_peserta_ditanggung = id_ditanggung;
		this.kepala_keluarga = kepala_keluarga;
		this.hubungan_keluarga = hubungan_keluarga;
		this.jk = jk;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdPesertaPenanggung() {
		return id_peserta_penanggung;
	}

	public void setIdPesertaPenanggung(String id) {
		this.id_peserta_penanggung = id;
	}
	
	public String getIdPesertaDitanggung() {
		return id_peserta_ditanggung;
	}

	public void setIdPesertaDitanggung(String id) {
		this.id_peserta_ditanggung = id;
	}

	public boolean isKepalaKeluarga() {
		return kepala_keluarga;
	}

	public void setKepalaKeluarga(boolean kepala_keluarga) {
		this.kepala_keluarga = kepala_keluarga;
	}

	public String getHubunganKeluarga() {
		return hubungan_keluarga;
	}

	public void setHubunganKeluarga(String hubungan_keluarga) {
		this.hubungan_keluarga = hubungan_keluarga;
	}

	public char getJk() {
		return jk;
	}

	public void setJk(char jk) {
		this.jk = jk;
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
