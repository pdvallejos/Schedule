package com.pablo.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.agenda.entity.Phone;
import com.pablo.agenda.services.PhoneService;

@RestController
public class phoneController {
	
	@Autowired
	PhoneService service;
	
	@GetMapping("/phone/findAll")
    public Iterable<Phone> findAll() {
    	System.out.println("lalalllalaal");
        return service.findAll();
    }
    @PutMapping("/phone/edit")
    public String update(@RequestBody Phone phone) {
         try {
        	service.save(phone);	
        	return "los datos se actualizaron correctamente";
		} catch (Exception e) {
			return "ocurrio un error al actualizar los datos";
		}
         
    }
    @DeleteMapping("/phone/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deletePhone(id);
    }

    @PostMapping("/phone/add")
    public Phone save(@RequestBody Phone phone) {
        return service.save(phone);
    }


}
