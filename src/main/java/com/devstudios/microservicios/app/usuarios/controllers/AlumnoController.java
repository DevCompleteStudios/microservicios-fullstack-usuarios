package com.devstudios.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devstudios.microservicios.app.usuarios.models.Alumno;
import com.devstudios.microservicios.app.usuarios.services.AlumnoService;



@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id ){
        Optional<Alumno> alumno = service.findById(id);
        if(alumno.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(alumno.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    public ResponseEntity<?> create( @RequestBody Alumno alumno ){
        return ResponseEntity.ok(service.save(alumno));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update( @PathVariable Long id, @RequestBody Alumno alumno ){
        // validar actualizaciones
        Optional<Alumno> alumnoOptional = service.findById(id);
        if(alumnoOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Alumno alumnoDb = alumnoOptional.get();
        if(alumno.getApellido() != null) alumnoDb.setApellido(alumno.getApellido());
        if(alumno.getNombre() != null) alumnoDb.setNombre(alumno.getNombre());
        if(alumno.getEmail() != null) alumnoDb.setEmail(alumno.getEmail());

        service.save(alumnoDb);
        return ResponseEntity.ok(alumnoDb);
    }

}
