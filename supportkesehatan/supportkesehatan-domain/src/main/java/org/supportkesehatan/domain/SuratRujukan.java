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
	@Column(name = "id_surat_rujukan")
	private UUID id;
	
	@Column(name = "tanggal_surat", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggal_surat;

	public SuratRujukan(UUID id, DateTime tanggal_surat) {
		super();
		this.id = id;
		this.tanggal_surat = tanggal_surat;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public DateTime getTanggal_surat() {
		return tanggal_surat;
	}

	public void setTanggal_surat(DateTime tanggal_surat) {
		this.tanggal_surat = tanggal_surat;
	}
	
	
}
