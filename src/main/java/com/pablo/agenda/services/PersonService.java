package com.pablo.agenda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablo.agenda.entity.Person;
import com.pablo.agenda.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository repository;
	
	public void deletePerson(Long id) {
		repository.deleteById(id);
	}

	public Person save(Person persona) {
		return repository.save(persona); 
	}
	public Iterable<Person> findAll() {
		return repository.findAll();
	}

	public Optional<Person> findById(Long id) {
		return repository.findById(id);
	}
}
