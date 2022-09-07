package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;

import java.util.List;
import java.util.Map;

public interface IEmpresaService {
    public List<Empresa> listEmpresa();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa getEmpresaById(int nit);
    public Empresa updateEmpresaById(Integer nit, Map<Object, Object> objectMap);
    public void deleteEmpresaById(Integer nit);
}
