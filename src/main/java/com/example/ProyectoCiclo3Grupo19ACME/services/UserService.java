package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{
    //Atributos
    private UserRepository userRepository;

    //Constructores
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}