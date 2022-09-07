package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmpresaController {
//    @Autowired //esto no se pa que es o si es necesario, ojo borarlo si algo
    /*private*/ EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @GetMapping("/enterprises")
    public List<Empresa> getListEmpresa(){
        return this.empresaService.listEmpresa();
    }

    @PostMapping("/enterprises")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.createEmpresa(empresa);
    }

    @GetMapping("/enterprises/{id}")
    public Empresa getEmpresaById(@PathVariable("id") Integer nit){
        return this.empresaService.getEmpresaById(nit);
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa updateEmpresaById(@PathVariable("id") Integer nit, @RequestBody Map<Object, Object> objectMap){
        return this.empresaService.updateEmpresaById(nit, objectMap);
    }

    @DeleteMapping("/enterprises/{id}")
    public void deleteEmpresaById(@PathVariable("id") Integer nit){
        empresaService.deleteEmpresaById(nit);
    }
}
