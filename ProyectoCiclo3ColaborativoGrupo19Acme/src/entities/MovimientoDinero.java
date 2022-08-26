package entities;

public class MovimientoDinero {
    //Creacion de la clase MovimientoDinero
    //Atributos
    private double monto;
    private String concepto;
    private Empleado usuario;
    Empleado empleado = new Empleado();

    //Constructores
    public MovimientoDinero(Empleado empleado, double monto, String concepto){
        this.usuario = empleado;
        this.monto = monto;
        this.concepto = concepto;
    }

    public MovimientoDinero(){
        this.usuario = empleado;
    }

    //Metodos
    public String usuarioMovimientoDinero(){
        return this.usuario.getNombrEmpleado();
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

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado empleado) {
        this.usuario = empleado;
    }
}
