package com.example.ProyectoCiclo3Grupo19ACME.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero /*implements Serializable*/ {
    //Creacion de la clase MovimientoDinero
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "monto", nullable = false)
    private double monto;
    @Column(name = "concepto", nullable = false)
    private String concepto;
//    @Column(name = "Usuario", nullable = false)
//    private Empleado usuario;
//    Empleado empleado = new Empleado();
    @ManyToOne
    @JoinColumn(name = "nit_empresa", nullable = false)
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name = "id_empleado",nullable = false)
    private Empleado empleado;

    //Constructores
    public MovimientoDinero(/*Empleado empleado,*/ double monto, String concepto){
//        this.usuario = empleado;
        this.monto = monto;
        this.concepto = concepto;
    }

    public MovimientoDinero(){
//        this.usuario = empleado;
    }

    //Metodos
//    public String usuarioMovimientoDinero(){
//        return this.usuario.getNombrEmpleado();
//    }

    //Getters y Setters
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

//    public Empleado getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Empleado empleado) {
//        this.usuario = empleado;
//    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
