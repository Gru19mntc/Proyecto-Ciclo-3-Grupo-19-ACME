package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> listEmpleado(){
        return this.empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(int idEmpleado){
        return this.empleadoRepository.findById(idEmpleado).get();
    }

    public Empleado createEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }

    public Empleado updateEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }

    public void deleteEmpleado(Integer idEmpleado){
        empleadoRepository.deleteById(idEmpleado);
    }
}
