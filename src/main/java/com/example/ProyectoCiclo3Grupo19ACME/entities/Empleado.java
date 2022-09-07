package com.example.ProyectoCiclo3Grupo19ACME.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Empleado {
    //Creacion de la Clase Empleado
    @Id
    private int idEmpleado;
    @Column(nullable = false)
    private String nombrEmpleado;
    @Column(nullable = false)
    private String correoEmpleado;
    @Column(nullable = false)
    private String rolEmpleado;
    @ManyToOne
    @JoinColumn(name = "emp_nit_empresa",nullable = false,referencedColumnName = "nit")
    private Empresa empresa;

    //Constructores
    public Empleado(int idEmpleado, String nombrEmpleado, String correoEmpleado, /*Empresa empresaEmpleado,*/ String rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombrEmpleado = nombrEmpleado;
        this.correoEmpleado = correoEmpleado;
//        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
        //Se añade la inicializacion para verificar el funcionamiento de la clase "MovimientoDinero"
//        this.nombrEmpleado = "GenericoPruebas";
    }

    //Metodos
//    public String empresaEmpleado(){
//        return this.empresaEmpleado.getName();
//    }

    //Setters y Getters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombrEmpleado() {
        return nombrEmpleado;
    }

    public void setNombrEmpleado(String nombrEmpleado) {
        this.nombrEmpleado = nombrEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}