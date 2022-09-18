package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.entities.User;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpleadoService;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import com.example.ProyectoCiclo3Grupo19ACME.services.MovimientoDineroService;
import com.example.ProyectoCiclo3Grupo19ACME.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    //Atributos
    EmpleadoService empleadoService;
    EmpresaService empresaService;
    MovimientoDineroService movimientoDineroService;
    UserService userService;

    //Constructores
    public FrontController(EmpleadoService empleadoService, EmpresaService empresaService, MovimientoDineroService movimientoDineroService, UserService userService){
        this.empleadoService = empleadoService;
        this.empresaService = empresaService;
        this.movimientoDineroService= movimientoDineroService;
        this.userService = userService;
    }

    //Metodos
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            User user = this.userService.getOrCreateUser(principal.getClaims());
        }
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
    public String empresaTabla(Model model){
        List<Empresa> empresaList = this.empresaService.listEmpresa();
        model.addAttribute("empresaList", empresaList);
        return "empresaTabla";
    }

    @GetMapping("/home/empresas/nueva")
    public String empresa(Model model){
        model.addAttribute("empresa", new Empresa());
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
