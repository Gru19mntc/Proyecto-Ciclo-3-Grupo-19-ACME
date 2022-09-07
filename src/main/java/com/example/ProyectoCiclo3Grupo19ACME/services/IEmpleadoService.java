package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;

import java.util.List;
import java.util.Map;

public interface IEmpleadoService {
    public List<Empleado> listEmpleado();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado getEmpleadoById(int idEmpleado);
    public Empleado updateEmpleadoById(Integer idEmpleado, Map<Object, Object> objectMap);
    public void deleteEmpleadoById(Integer idEmpleado);
}
