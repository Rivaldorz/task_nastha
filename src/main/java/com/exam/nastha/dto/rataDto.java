package com.exam.nastha.dto;

import javax.persistence.Column;

public class rataDto {
	
	public rataDto(String nama, double nilai) {
	
	
		this.nama = nama;
		
		this.nilai = nilai;
		
	}
	private String nama;
	private double nilai;

	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public double getNilai() {
		return Math.ceil(nilai);
	}
	public void setNilai(double nilai) {
		double convert =Math.ceil(nilai);
		this.nilai = convert;
	}

}
