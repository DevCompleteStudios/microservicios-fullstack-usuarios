package com.devstudios.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devstudios.microservicios.app.commons.controllers.CommonController;
import com.devstudios.microservicios.app.usuarios.services.AlumnoService;
import com.microservicio.commons.alumnos.models.entities.Alumno;



@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {

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
