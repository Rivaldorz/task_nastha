package com.exam.nastha.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.exam.nastha.model.DataNilai;


public interface NilaiRepository  extends CrudRepository<DataNilai,Long> {
 
	

	DataNilai findById(long Id);
	

	@Query("select  m.id,k.id,n.nilai,n.keterangan from DataNilai n JOIN Mahasiswa m" + 
			"					 ON n.idMahasiswa = m.id JOIN MataKuliah k ON n.idMahasiswa=k.idMahasiswa" )
	List<DataNilai> showFuse();
	
	
	@Query("select  m.nama,AVG(n.nilai) as nilairata from DataNilai n JOIN Mahasiswa m" + 
			"					 ON n.idMahasiswa = m.id" + 
			"					GROUP BY m.nama")
	List<DataNilai> showAll();
}
