package com.example.ProyectoCiclo3Grupo19ACME.repositories;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
