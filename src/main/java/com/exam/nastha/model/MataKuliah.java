package com.exam.nastha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "mata_kuliah")
public class MataKuliah {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", length = 11)
	private Long id;
	

	@NotBlank(message="Nama Mata Kuliah tidak boleh Kosong")
	@Column (name = "nama_mata_kuliah",length=255)
	private String namaMataKuliah;
	


	@Column (name = "id_mahasiswa")
	private Long idMahasiswa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaMataKuliah() {
		return namaMataKuliah;
	}

	public void setNamaMataKuliah(String namaMataKuliah) {
		this.namaMataKuliah = namaMataKuliah;
	}

	public Long getIdMahasiswa() {
		return idMahasiswa;
	}

	public void setIdMahasiswa(Long idMahasiswa) {
		idMahasiswa = idMahasiswa;
	}
}
