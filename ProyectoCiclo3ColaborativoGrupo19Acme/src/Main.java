import entities.Empleado;
import entities.MovimientoDinero;

public class Main {
    public static void main (String[] args) {
        //Espacio para verificacion del funcionamiento de la clase Empresa



        //Espacio para verificacion del funcionamiento de la clase Empleado



        //Espacio para verificacion del funcionamiento de la clase MovimientoDinero
        MovimientoDinero ingreso1 = new MovimientoDinero();
        System.out.println(ingreso1.getUsuario()); //verificacion de Constructor vacio
        ingreso1.setUsuario("Pepito"); //Verificacion del setter para usuario
        System.out.println(ingreso1.getUsuario()); //Verificacion de Getter para usuario
        ingreso1.setConcepto("Venta de producto"); //Verificacion de Setter para concepto
        System.out.println(ingreso1.getConcepto()); //Verificacion de Getter para concepto
        ingreso1.setMonto(5000); //Verificacion de Setter para el monto
        System.out.println(ingreso1.getMonto()); //Verificacion de Getter para monto
        MovimientoDinero ingreso2 = new MovimientoDinero(new Empleado(),-7000,"Compra de insumos"); /*
        Verificacion del constructor con argumentos*/
        System.out.println(ingreso2.getMonto()); //Verificacion del monto negativo

    }
}
