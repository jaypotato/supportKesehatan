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
@Table(name ="surat_rujukan")
public class SuratRujukan {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_surat_rujukan", nullable = false)
	private String id;
	
	@Column(name = "id_peserta", nullable = false)
	private String id_peserta;
	
	@Column(name = "id_sarana_pengirim", nullable = false)
	private String id_sarana_pengirim;
	
	@Column(name = "id_sarana_penerima", nullable = false)
	private String id_sarana_penerima;
	
	@Column(name = "tanggal_surat", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggal_surat;

	public SuratRujukan(String id, DateTime tanggal_surat) {
		super();
		this.id = id;
		this.tanggal_surat = tanggal_surat;
	}
	
	public SuratRujukan(String id, String id_peserta, 
			String id_pengirim, String id_penerima, 
			DateTime tanggal_surat) {
		super();
		this.id = id;
		this.id_peserta = id_peserta;
		this.id_sarana_pengirim = id_pengirim;
		this.id_sarana_penerima = id_penerima;
		this.tanggal_surat = tanggal_surat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdPeserta() {
		return id_peserta;
	}

	public void setIdPeserta(String id) {
		this.id_peserta= id;
	}
	
	public String getIdSaranaPengirim() {
		return id_sarana_pengirim;
	}

	public void setIdSaranaPengirim(String id) {
		this.id_sarana_pengirim = id;
	}
	
	public String getIdSaranaPenerima() {
		return id_sarana_penerima;
	}

	public void setIdSaranaPenerima(String id) {
		this.id_sarana_penerima= id;
	}

	public DateTime getTanggalSurat() {
		return tanggal_surat;
	}

	public void setTanggalSurat(DateTime tanggal_surat) {
		this.tanggal_surat = tanggal_surat;
	}
	
	
}
