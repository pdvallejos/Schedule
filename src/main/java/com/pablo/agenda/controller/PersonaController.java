package com.pablo.agenda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.agenda.entity.Person;
import com.pablo.agenda.repository.PersonRepository;
import com.pablo.agenda.services.PersonService;

@RestController
@CrossOrigin(origins =  "*")
@RequestMapping(path = "Person")
public class PersonaController {
    @Autowired
    PersonService service;
    
    @GetMapping("/findAll")
    public Iterable<Person> findAll() {
    	System.out.println("lalalllalaal");
        return service.findAll();
    }
    @PutMapping("/edit")
    public String update(@RequestBody Person person) {
         try {
        	service.save(person);	
        	return "los datos se actualizaron correctamente";
		} catch (Exception e) {
			return "ocurrio un error al actualizar los datos";
		}
         
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deletePerson(id);
    }

    @PostMapping("/add")
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }

	
}