package com.devstudios.microservicios.app.usuarios.services;

import java.util.List;

import com.devstudios.microservicios.app.commons.services.CommonService;
import com.microservicio.commons.alumnos.models.entities.Alumno;



public interface AlumnoService extends CommonService<Alumno> {
    public List<Alumno> searchAlumnosByName(String name);
}
