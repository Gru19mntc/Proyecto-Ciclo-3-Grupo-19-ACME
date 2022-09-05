package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    EmpresaService empresaService;

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
    public Empresa updateEmpresaById(/*@PathVariable("id")*/ @RequestBody Empresa empresa){
        return this.empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/enterprises/{id}")
    public void deleteEmpresaById(@PathVariable("id") Integer nit){
        empresaService.deleteEmpresa(nit);
    }
}
