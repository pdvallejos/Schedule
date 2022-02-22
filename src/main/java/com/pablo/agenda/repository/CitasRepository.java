package com.pablo.agenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pablo.agenda.entity.Citas;

@Repository
public interface CitasRepository extends CrudRepository <Citas, Long>{

}
