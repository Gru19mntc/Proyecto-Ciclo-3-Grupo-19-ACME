package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
    //Atributos


    //Constructores


    //Metodos
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        return "index";
    }
//    @GetMapping("/")
//    public String index(){
//        return "home";
//    }
}
