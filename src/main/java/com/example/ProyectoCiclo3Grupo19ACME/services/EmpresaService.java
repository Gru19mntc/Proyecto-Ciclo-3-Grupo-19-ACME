package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> listEmpresa(){
        return this.empresaRepository.findAll();
    }

    public Empresa getEmpresaById(int nit){
        return this.empresaRepository.findById(nit).get();
    }

    public Empresa createEmpresa(Empresa empresa){
        return this.empresaRepository.save(empresa);
    }

    public Empresa updateEmpresa(Empresa empresa){
        return this.empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Integer nit){
        empresaRepository.deleteById(nit);
    }

}
