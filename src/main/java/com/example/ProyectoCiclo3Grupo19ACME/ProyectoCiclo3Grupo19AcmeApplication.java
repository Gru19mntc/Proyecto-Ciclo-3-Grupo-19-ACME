package com.example.ProyectoCiclo3Grupo19ACME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Se agrega esta anotacion para configurar el servidor web
@SpringBootApplication
public class ProyectoCiclo3Grupo19AcmeApplication {

	public static void main(String[] args) {
		//Se agrega esta linea para inicializar el sevicio web
		SpringApplication.run(ProyectoCiclo3Grupo19AcmeApplication.class, args);
		//Se comenta todo el codigo para validar el servicio web
//        //Espacio para verificacion del funcionamiento de la clase Empresa
//        System.out.println("Validacion de la clase \"Empresa\":");
//        String Empresano="dormiluna";
//        Empresa enp1=new Empresa(Empresano,"calle34", 30023456,1011324);
//        System.out.println(enp1.getName());
//        enp1.setName("Ara");
//        System.out.println(enp1.getName());
//        enp1.setAdress("numero49");
//        System.out.println(enp1.getAdress());
//        enp1.setTelf(30045623);
//        System.out.println(enp1.getTelf());
//        enp1.setNit(1234526);
//        System.out.println(enp1.getNit());
//        System.out.println("------------------------------------------------------------------");
//        //Espacio para verificacion del funcionamiento de la clase Empleado
//        System.out.println("Validacion de la clase \"Empleado\":");
//        /*Constantes*/
//        String Empresa= String.valueOf("pyptec");
//        String Nombre= String.valueOf("Jaime");
//        String Correo= String.valueOf("pyptec@hotmail.com");
//        int Id=123456789;
//        String Cargo= String.valueOf("Ingeniero");
//        /*instancia de la clase*/
//        Empleado nEmpleado = new Empleado();
//        /*Ingreso de datos*/
//        nEmpleado.setEmpresaEmpleado(enp1);
//        nEmpleado.setNombrEmpleado(Nombre);
//        nEmpleado.setCorreoEmpleado(Correo);
//        nEmpleado.setIdEmpleado(Id);
//        nEmpleado.setRolEmpleado(Cargo);
//        /*Se muestra los datos grabados por get*/
//        System.out.println(nEmpleado.empresaEmpleado());
//        System.out.println(nEmpleado.getNombrEmpleado());
//        System.out.println(nEmpleado.getCorreoEmpleado());
//        System.out.println(nEmpleado.getIdEmpleado());
//        System.out.println(nEmpleado.getRolEmpleado());
//        /*Validacion empleado por contructor con argumentos */
//        Empleado nEmpleado2 = new Empleado(123,"Andres","andy123@gmail.com",new Empresa(),"Administrador");
//        System.out.println(nEmpleado2.getIdEmpleado());
//        System.out.println(nEmpleado2.empresaEmpleado());
//        System.out.println(nEmpleado2.getCorreoEmpleado());
//        System.out.println(nEmpleado2.getEmpresaEmpleado().getName());
//        System.out.println(nEmpleado2.getRolEmpleado());
//        System.out.println("------------------------------------------------------------------");
//        //Espacio para verificacion del funcionamiento de la clase MovimientoDinero
//        System.out.println("Validacion de la clase \"MovimientoDinero\":");
//        MovimientoDinero ingreso1 = new MovimientoDinero();
//        System.out.println(ingreso1.getUsuario().getNombrEmpleado()); //verificacion de Constructor vacio
//        ingreso1.setUsuario(nEmpleado); //Verificacion del setter para usuario
//        System.out.println(ingreso1.usuarioMovimientoDinero()); //Verificacion de metodo para usuario
//        ingreso1.setConcepto("Venta de producto"); //Verificacion de Setter para concepto
//        System.out.println(ingreso1.getConcepto()); //Verificacion de Getter para concepto
//        ingreso1.setMonto(5000); //Verificacion de Setter para el monto
//        System.out.println(ingreso1.getMonto()); //Verificacion de Getter para monto
//        MovimientoDinero egreso1 = new MovimientoDinero(new Empleado(),-7000,"Compra de insumos"); /*
//        Verificacion del constructor con argumentos*/
//        System.out.println(egreso1.getMonto()); //Verificacion del monto negativo
//        MovimientoDinero egreso2 = new MovimientoDinero(nEmpleado,-70800,"Compra de repuestos"); /*
//        Verificacion del constructor con argumentos con un empleado ya creado*/
//        System.out.println(egreso2.getUsuario().getNombrEmpleado()); //Verificacion del usuario con empleado ya creado.
//        System.out.println("------------------------------------------------------------------");
	}

}
