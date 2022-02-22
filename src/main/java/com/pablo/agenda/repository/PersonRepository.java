package com.pablo.agenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pablo.agenda.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}
