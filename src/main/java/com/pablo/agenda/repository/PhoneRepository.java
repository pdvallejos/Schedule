package com.pablo.agenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pablo.agenda.entity.Phone;

@Repository
public interface PhoneRepository extends CrudRepository <Phone, Long>{

}
