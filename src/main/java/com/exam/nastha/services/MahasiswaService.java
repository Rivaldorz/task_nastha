package com.exam.nastha.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.nastha.exceptions.IdExceptions;
import com.exam.nastha.model.Mahasiswa;
import com.exam.nastha.repositories.MahasiswaRepository;


@Service
public class MahasiswaService {
	
	@Autowired
	private MahasiswaRepository mahasiswaRepo;

	
	public void deleteMahasiswa(long mhsId) {
	Mahasiswa mhs=mahasiswaRepo.findById(mhsId);
	
		if(mhs ==null) {
				throw new IdExceptions("mahasiswa dengan ID '"+mhs+"'telah dihapus atau tidak ada");
		}
		mahasiswaRepo.delete(mhs);
		
		
	}
	
}
