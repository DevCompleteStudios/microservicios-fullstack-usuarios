package com.devstudios.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.devstudios.microservicios.app.commons.services.CommonServiceImpl;
import com.devstudios.microservicios.app.usuarios.repositories.AlumnoRepository;
import com.microservicio.commons.alumnos.models.entities.Alumno;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository>
    implements AlumnoService {}
