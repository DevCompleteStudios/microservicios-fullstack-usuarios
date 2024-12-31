package com.devstudios.microservicios.app.usuarios.services;

import java.util.Optional;

import com.devstudios.microservicios.app.usuarios.models.Alumno;



public interface AlumnoService {
    Iterable<Alumno> findAll();
    Optional<Alumno> findById(Long id);
    Alumno save(Alumno alumno);
    void deleteById(Long id);
}
