package com.exam.nastha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.nastha.exceptions.IdExceptions;
import com.exam.nastha.model.Mahasiswa;
import com.exam.nastha.model.DataNilai;
import com.exam.nastha.repositories.MahasiswaRepository;
import com.exam.nastha.repositories.MataKuliahRepository;
import com.exam.nastha.repositories.NilaiRepository;


@Service
public class NilaiService {
	
	@Autowired
	private NilaiRepository nilaiRepo;

	@Autowired
	private MahasiswaRepository mhsRepo;
	@Autowired
	private MataKuliahRepository matkulRepo;
	
	 public List<DataNilai> showAll(){
			return nilaiRepo.showAll();
	 }
	
	 public List<DataNilai> showFuse(){
			return nilaiRepo.showFuse();
	 }
	 public DataNilai save(DataNilai nilai) {

	            return nilaiRepo.save(nilai);
	 }
	
	public void deleteNilai(long nilId) {
	DataNilai nil=nilaiRepo.findById(nilId);
	
		if(nil ==null) {
				throw new IdExceptions("nilai dengan ID '"+nilId+"'telah dihapus atau tidak ada");
		}
		nilaiRepo.deleteById(nilId);
		
	}

	
}
