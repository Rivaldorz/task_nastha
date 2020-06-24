package com.exam.nastha.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.nastha.model.DataNilai;
import com.exam.nastha.model.Mahasiswa;

@Repository
public interface MahasiswaRepository  extends CrudRepository<Mahasiswa,Long>  {


	
	
	Mahasiswa findById(long Id);
	
}
