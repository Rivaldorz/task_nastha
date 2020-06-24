package com.exam.nastha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", length = 11)
	private Long id;
	
	public Long getId() {
		return id;
	}
	@NotBlank(message="Nama tidak boleh Kosong")
	@Column (name = "nama")
	private String nama;


	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAlamat() {
		return Alamat;
	}


	public void setAlamat(String alamat) {
		Alamat = alamat;
	}


	@NotBlank(message="Alamat Name tidak boleh Kosong")
	@Column (name = "alamat")
	private String Alamat;

}
