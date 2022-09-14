package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
    //Atributos


    //Constructores


    //Metodos
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
