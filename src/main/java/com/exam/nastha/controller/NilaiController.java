package com.exam.nastha.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.nastha.model.DataNilai;
import com.exam.nastha.services.NilaiService;

import antlr.collections.List;


@RestController
@RequestMapping("/api/nilai")
public class NilaiController {
	@Autowired
	private NilaiService nilaiService;
	
	@GetMapping("all")
	public Iterable<DataNilai> getAllProjects(){
		return nilaiService.showAll();
	}
	@GetMapping("fuse")
	public Iterable<DataNilai> getAllfused(){
		return nilaiService.showFuse();
	}
	
	@PutMapping("/put")
	public ResponseEntity<?>putFamilyTree(@RequestBody DataNilai nilai){
		DataNilai saving=nilaiService.save(nilai);
		return new ResponseEntity<>(nilaiService.save(saving), HttpStatus.OK);
	}
	
	
	@PostMapping("")
	// ?  adalah generics
	public ResponseEntity<?> createNewProject( @RequestBody DataNilai nilai,BindingResult result){

	
		DataNilai saving=nilaiService.save(nilai);
		return new ResponseEntity<DataNilai>(saving,HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProject(@PathVariable long id){
		nilaiService.deleteNilai(id);
		
		return new ResponseEntity<String>("Project dengan Id : "+id+" berhasil dihapus",HttpStatus.OK);
	}
	
	
}
