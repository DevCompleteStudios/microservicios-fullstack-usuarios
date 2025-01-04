package com.devstudios.microservicios.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devstudios.microservicios.app.commons.services.CommonServiceImpl;
import com.devstudios.microservicios.app.usuarios.repositories.AlumnoRepository;
import com.microservicio.commons.alumnos.models.entities.Alumno;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository>
    implements AlumnoService {

    @Override
    @Transactional(readOnly=true)
    public List<Alumno> searchAlumnosByName(String name) {
        return this.repository.searchAlumnosByName(name);
    }
}
