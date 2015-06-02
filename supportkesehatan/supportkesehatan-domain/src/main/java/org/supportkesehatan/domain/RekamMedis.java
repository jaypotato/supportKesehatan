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
	@Column(name = "id_rekam_medis", nullable = false)
	private String id;
	
	@Column(name = "id_sarana", nullable = false)
	private String id_sarana;
	
	@Column(name = "id_tenaga_medis", nullable = false)
	private String id_tenaga_medis;
	
	@Column(name = "id_peserta", nullable = false)
	private String id_peserta;
	
	@Column(name = "tanggal_rekam_medis", nullable = false)
	private DateTime tanggal;
	
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

	public RekamMedis(String id,  String id_sarana, String id_tenaga_medis,
			String id_peserta, DateTime tanggal, String diagnosa,
			DateTime create_date, DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.id_sarana = id_sarana;
		this.id_tenaga_medis = id_tenaga_medis;
		this.id_peserta = id_peserta;
		this.tanggal = tanggal;
		this.diagnosa = diagnosa;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}
	
	public RekamMedis(String id, DateTime tanggal, String diagnosa,
			DateTime create_date, DateTime last_update, boolean soft_delete) {
		super();
		this.id = id;
		this.tanggal = tanggal;
		this.diagnosa = diagnosa;
		this.create_date = create_date;
		this.last_update = last_update;
		this.soft_delete = soft_delete;
	}

	public RekamMedis(String id, DateTime tanggal, String diagnosa) {
		super();
		this.id = id;
		this.tanggal = tanggal;
		this.diagnosa = diagnosa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdSarana() {
		return id_sarana;
	}

	public void setIdSarana(String id) {
		this.id_sarana = id;
	}
	
	public String getIdTenagaMedis() {
		return id_tenaga_medis;
	}

	public void setIdTenagaMedis(String id) {
		this.id_tenaga_medis = id;
	}
	
	public String getIdPeserta() {
		return id_peserta;
	}

	public void setIdPeserta(String id) {
		this.id_peserta = id;
	}

	public DateTime getTanggal() {
		return tanggal;
	}

	public void setTanggal(DateTime tanggal) {
		this.tanggal = tanggal;
	}

	public String getDiagnosa() {
		return diagnosa;
	}

	public void setDiagnosa(String diagnosa) {
		this.diagnosa = diagnosa;
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
