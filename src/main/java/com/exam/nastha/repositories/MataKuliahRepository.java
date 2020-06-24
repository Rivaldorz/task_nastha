package com.exam.nastha.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.nastha.model.MataKuliah;


@Repository
public interface MataKuliahRepository  extends CrudRepository<MataKuliah,Long> {

}
