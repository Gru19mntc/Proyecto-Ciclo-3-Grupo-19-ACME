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

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/home/empresas")
    public String empresaTabla(){
        return "empresaTabla";
    }

    @GetMapping("/home/empresas/nueva")
    public String empresa(){
        return "empresa";
    }

    @GetMapping("/home/usuarios")
    public String usuarioTabla(){
        return "usuarioTabla";
    }

    @GetMapping("/home/usuarios/nuevo")
    public String usuario(){
        return "usuario";
    }

    @GetMapping("/home/transaccion")
    public String movimientoDineroTabla(){
        return "movimientoDineroTabla";
    }

    @GetMapping("/home/transaccion/nueva")
    public String movimientoDinero(){
        return "movimientoDinero";
    }
}
