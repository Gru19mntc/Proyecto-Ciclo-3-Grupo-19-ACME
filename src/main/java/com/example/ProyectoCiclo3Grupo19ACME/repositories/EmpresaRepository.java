package com.example.ProyectoCiclo3Grupo19ACME.repositories;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}