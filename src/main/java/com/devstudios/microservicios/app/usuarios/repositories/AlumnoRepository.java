package com.devstudios.microservicios.app.usuarios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicio.commons.alumnos.models.entities.Alumno;




public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

    @Query("SELECT a FROM Alumno a WHERE a.nombre LIKE %?1% OR a.apellido LIKE %?1%")
    public List<Alumno> searchAlumnosByName( String name );

}
