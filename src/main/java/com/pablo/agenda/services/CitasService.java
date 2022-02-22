package com.pablo.agenda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablo.agenda.entity.Citas;
import com.pablo.agenda.repository.CitasRepository;


@Service
public class CitasService {
	@Autowired
	CitasRepository repository;
	
	public void deleteCitas(Long id) {
		repository.deleteById(id);
	}

	public Citas save(Citas cita) {
		return repository.save(cita); 
	}
	public Iterable<Citas> findAll() {
		return repository.findAll();
	}

	public Optional<Citas> findById(Long id) {
		return repository.findById(id);
	}
}
