package com.exam.nastha.dto;

public class FuseDto {

	
	public FuseDto(long id, String nama, String namaMatakuliah, int nilai) {
		
		this.id = id;
		this.nama = nama;
		NamaMatakuliah = namaMatakuliah;
		Nilai = nilai;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNamaMatakuliah() {
		return NamaMatakuliah;
	}
	public void setNamaMatakuliah(String namaMatakuliah) {
		NamaMatakuliah = namaMatakuliah;
	}
	public int getNilai() {
		return Nilai;
	}
	public void setNilai(int nilai) {
		Nilai = nilai;
	}
	private long id;
	private String nama;
	private String NamaMatakuliah;
	private int Nilai;
}
