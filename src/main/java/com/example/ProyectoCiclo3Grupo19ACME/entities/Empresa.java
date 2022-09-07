package com.example.ProyectoCiclo3Grupo19ACME.entities;
import javax.persistence.*;
@Entity
@Table(name = "empresa")
public class Empresa {
    //ATRIBUTOS
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private  long id;
    @Column(name = "nombre") private String nombre;
    @Column(name = "dir")  private String dir;
    @Column(name = "telf") private int telf;
    @Column(name = "nit") private int nit;
    //OBJETO PARA IR A LA DEPENDENCIA DE EMPLEADO
    @Transient
    Empleado empleado1;
    public Empresa() {
    }
    //CONSTRUCTORES
    public Empresa(String nombre, String dir, int telf, int nit, Empleado empleado1) {
        this.nombre = nombre;
        this.dir = dir;
        this.telf = telf;
        this.nit = nit;
        this.empleado1 = empleado1;
    }
    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
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
                "nombre='" + nombre + '\'' +
                ", dir='" + dir + '\'' +
                ", telf=" + telf +
                ", nit=" + nit +
                ", empleado1=" + this.empleado1 +
                '}';
    }
}
