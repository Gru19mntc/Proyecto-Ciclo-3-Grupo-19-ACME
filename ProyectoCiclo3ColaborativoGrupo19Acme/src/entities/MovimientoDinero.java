package entities;

public class MovimientoDinero {
    //Creacion de la clase MovimientoDinero
    //Atributos
    private double monto;
    private String concepto;
    private String usuario;
    Empleado empleado = new Empleado();

    //Constructor
    public MovimientoDinero(Empleado empleado, double monto, String concepto){
        this.usuario = empleado.getNombrEmpleado();
        this.monto = monto;
        this.concepto = concepto;
    }

    public MovimientoDinero(){
        this.usuario = empleado.getNombrEmpleado();
    }

    //Getters y Setters
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
