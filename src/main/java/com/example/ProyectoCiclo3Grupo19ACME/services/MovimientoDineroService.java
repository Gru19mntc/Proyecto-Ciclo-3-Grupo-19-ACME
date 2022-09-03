package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroService {
    private MovimientoDineroRepository movimientoDineroRepository;

    public MovimientoDineroService(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }

    public List<MovimientoDinero> getMovimientoDineroList(){
        return this.movimientoDineroRepository.findAll();
    }
    public MovimientoDinero createMovimientoDinero(MovimientoDinero newMovimientoDinero){
        return this.movimientoDineroRepository.save(newMovimientoDinero);
    }
    public MovimientoDinero getMovimientoDineroById(long id){
        return this.movimientoDineroRepository.findById(id).get();
    }
    public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero){
        return movimientoDineroRepository.save(movimientoDinero);
    }
    public void deleteMovimientoDinero(long id){
        movimientoDineroRepository.deleteById(id);
    }
}
