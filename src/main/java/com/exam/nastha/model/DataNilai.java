package com.exam.nastha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "datanilai")
public class DataNilai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", length = 11)
	private long id;
	
	@Column (name = "id_mahasiswa")
	private long idMahasiswa;
	@Column (name = "id_mata_kuliah")
	private long idMataKuliah;
	
	@Column (name = "nilai")
	private int nilai;
	@Column (name = "keterangan",length=1000)
	private String keterangan;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdMahasiswa() {
		return idMahasiswa;
	}
	public void setIdMahasiswa(long idMahasiswa) {
		this.idMahasiswa = idMahasiswa;
	}
	public long getIdMataKuliah() {
		return idMataKuliah;
	}
	public void setIdMataKuliah(long idMataKuliah) {
		this.idMataKuliah = idMataKuliah;
	}
	public int getNilai() {
		return nilai;
	}
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		keterangan = keterangan;
	}

}
