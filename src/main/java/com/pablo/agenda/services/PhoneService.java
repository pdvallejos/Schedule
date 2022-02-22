package com.pablo.agenda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablo.agenda.entity.Phone;
import com.pablo.agenda.repository.PhoneRepository;

@Service
public class PhoneService {
	@Autowired
	PhoneRepository repository;
	
	public void deletePhone(Long id) {
		repository.deleteById(id);
	}

	public Phone save(Phone phone) {
		return repository.save(phone); 
	}
	public Iterable<Phone> findAll() {
		return repository.findAll();
	}

	public Optional<Phone> findById(Long id) {
		return repository.findById(id);
	}

}
