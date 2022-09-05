package com.example.ProyectoCiclo3Grupo19ACME.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    private int nit;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String adress;
    @Column(nullable = false)
    private int telf;

//    @OneToMany(mappedBy = "empresa")
//    private List<Empleado> empleadoList = new ArrayList<>();

//    @OneToMany(mappedBy = "empresa")
//    private List<MovimientoDinero> empresaList = new ArrayList<>();

    //Constructor de la claseEmpresa
    public Empresa(String name, String adress, int telf, int nit) {
        this.name = name;
        this.adress = adress;
        this.telf = telf;
        this.nit = nit;
    }

    public Empresa(){
//        this.name = "Empresa Generica";
    }
    //Métodos Getters y Setter, los getter obtienen los datos de la propiedad, los setter cambian los valores
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public int getTelf() {
        return telf;
    }
    public void setTelf(int telf) {
        this.telf = telf;
    }
    public int getNit() {
        return nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }

//    public List<MovimientoDinero> getEmpresaList() {
//        return empresaList;
//    }
//
//    public void setEmpresaList(List<MovimientoDinero> empresaList) {
//        this.empresaList = empresaList;
//    }
//
//    public List<Empleado> getEmpleadoList() {
//        return empleadoList;
//    }
//
//    public void setEmpleadoList(List<Empleado> empleadoList) {
//        this.empleadoList = empleadoList;
//    }
}
