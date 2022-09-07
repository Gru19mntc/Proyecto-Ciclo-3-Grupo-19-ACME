package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;
import com.example.ProyectoCiclo3Grupo19ACME.services.MovimientoDineroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDineroController {
    MovimientoDineroService movimientoDineroService;

    public MovimientoDineroController(MovimientoDineroService movimientoDineroService){
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping("/MovimientoDinero")
    public List<MovimientoDinero> getMovimientoDineroList(){
        return this.movimientoDineroService.getMovimientoDineroList();
    }

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getMovimientoDineroByIdEmpresaList(@PathVariable int id){
        return this.movimientoDineroService.getMovimientoDineroByIdEmpresaList(id);
    }

    @PostMapping("/MovimientoDinero")
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoDineroService.createMovimientoDinero(movimientoDinero);
    }

//    @PatchMapping("/MovimientoDinero")
//    public MovimientoDinero updateMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
//        return this.movimientoDineroService.updateMovimientoDinero(movimientoDinero);
//    }
//
//    @DeleteMapping("/MovimientoDinero")
//    public void deleteMovimientoCliente(@RequestBody MovimientoDinero movimientoDinero){
//        movimientoDineroService.deleteMovimientoDinero(movimientoDinero.getId());
//    }
}
