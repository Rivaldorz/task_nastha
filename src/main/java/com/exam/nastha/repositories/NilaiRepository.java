package com.exam.nastha.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.exam.nastha.dto.FuseDto;
import com.exam.nastha.dto.rataDto;
import com.exam.nastha.model.DataNilai;


public interface NilaiRepository  extends CrudRepository<DataNilai,Long> {
 
	

	DataNilai findById(long Id);
	

	@Query("select new com.exam.nastha.dto.FuseDto(  m.id as id ,m.nama AS nama ,k.namaMataKuliah  as namaMataKuliah ,n.nilai as nilai) from DataNilai n JOIN Mahasiswa m" + 
			"					 ON n.idMahasiswa = m.id JOIN MataKuliah k ON n.idMahasiswa=k.idMahasiswa" )
	List<FuseDto> showFuse();
	
	
	@Query("select  new com.exam.nastha.dto.rataDto( m.nama as nama,AVG(n.nilai) as nilai ) FROM DataNilai n JOIN Mahasiswa m" + 
			"					 ON n.idMahasiswa = m.id" + 
			"					GROUP BY m.nama")
	List<rataDto> showAll();
}
