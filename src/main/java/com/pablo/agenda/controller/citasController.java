package com.pablo.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.agenda.entity.Citas;
import com.pablo.agenda.services.CitasService;

@RestController
public class citasController {
	
	@Autowired
	CitasService service;
	
	@GetMapping("/citas/findAll")
    public Iterable<Citas> findAll() {
    	System.out.println("lalalllalaal");
        return service.findAll();
    }
    @PutMapping("/citas/edit")
    public String update(@RequestBody Citas citas) {
         try {
        	service.save(citas);	
        	return "los datos se actualizaron correctamente";
		} catch (Exception e) {
			return "ocurrio un error al actualizar los datos";
		}
         
    }
    @DeleteMapping("/citas/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteCitas(id);
    }

    @PostMapping("/citas/add")
    public Citas save(@RequestBody Citas citas) {
        return service.save(citas);
    }

}
