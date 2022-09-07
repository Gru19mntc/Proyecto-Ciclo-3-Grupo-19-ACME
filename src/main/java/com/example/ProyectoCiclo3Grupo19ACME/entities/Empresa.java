package com.example.ProyectoCiclo3Grupo19ACME.entities;
import javax.persistence.*;
@Entity
@Table(name = "empresa")
public class Empresa {
    //ATRIBUTOS
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "nit") private int nit;
    @Column(name = "name") private String name;
    @Column(name = "adress")  private String adress;
    @Column(name = "telf") private int telf;

    //OBJETO PARA IR A LA DEPENDENCIA DE EMPLEADO
    @Transient
    Empleado empleado1;
    public Empresa() {
    }
    //CONSTRUCTORES
    public Empresa(String name, String adress, int telf, int nit, Empleado empleado1) {
        this.name = name;
        this.adress = adress;
        this.telf = telf;
        this.nit = nit;
        this.empleado1 = empleado1;
    }
    //GETTERS & SETTERS
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getadress() {
        return adress;
    }
    public void setadress(String adress) {
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
    public Empleado getEmpleado1() {
        return empleado1;
    }
    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }
    //MÉTODO PARA HACER PRUEBAS

    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", telf=" + telf +
                ", nit=" + nit +
                ", empleado1=" + this.empleado1 +
                '}';
    }
}
