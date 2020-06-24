package com.exam.nastha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.nastha.repositories.MataKuliahRepository;
import com.exam.nastha.repositories.NilaiRepository;

@Service
public class MataKuliahService {
	
	@Autowired
	private MataKuliahRepository mataKuliahRepo;

}
