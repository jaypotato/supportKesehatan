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
@Table(name = "peserta_jaskes")
public class PesertaJaskes {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_peserta", nullable = false)
	private UUID id;
	

	
	@Column(name = "nama", length=30, nullable = false)
	private String nama;
			
	@Column(name = "alamat", length = 50, nullable = false)
	private String alamat;
	
	@Column(name = "soft_delete", nullable = false)
	private boolean soft_delete;
	
	@Column(name = "create_date")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime create_date;

	@Column(name = "last_update", nullable = true)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime last_update;

	public PesertaJaskes(){
	}

	public PesertaJaskes(UUID id,  
			String nama, String alamat,
			boolean soft_delete, DateTime create_date, DateTime last_update) {
		//super();
		this.id = id;
		//this.id_jenis_kepesertaan = id_jenis_kepesertaan;
		this.nama = nama;
		this.alamat = alamat;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}
	
	public PesertaJaskes(String nama, String alamat,
			boolean soft_delete, DateTime create_date, DateTime last_update) {
		//super();
		//this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.soft_delete = soft_delete;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public PesertaJaskes( String nama, String alamat) {
		//super();
		//this.id = id;
		this.nama = nama;
		this.alamat = alamat;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	/*public String getIdJenisKepesertaan() {
		return id_jenis_kepesertaan;
	}

	public void setIdJenisKepesertaan(String id) {
		this.id_jenis_kepesertaan = id;
	}*/

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public boolean getSoftDelete() {
		return soft_delete;
	}

	public void setSoftDelete(boolean soft_delete) {
		this.soft_delete = soft_delete;
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

	
}
