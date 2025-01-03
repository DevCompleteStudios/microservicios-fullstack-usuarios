package com.devstudios.microservicios.app.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.commons.alumnos.models.entities.Alumno;




public interface AlumnoRepository extends CrudRepository<Alumno, Long> {}
