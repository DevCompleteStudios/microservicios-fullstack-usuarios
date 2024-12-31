package com.devstudios.microservicios.app.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;

import com.devstudios.microservicios.app.usuarios.models.Alumno;



public interface AlumnoRepository extends CrudRepository<Alumno, Long> {}
