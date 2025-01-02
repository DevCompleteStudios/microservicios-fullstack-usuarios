package com.devstudios.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.devstudios.microservicios.app.commons.services.CommonServiceImpl;
import com.devstudios.microservicios.app.usuarios.models.Alumno;
import com.devstudios.microservicios.app.usuarios.repositories.AlumnoRepository;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository>
    implements AlumnoService {}
