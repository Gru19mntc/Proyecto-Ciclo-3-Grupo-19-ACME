package entities;

public class Empleado {
    //Creacion de la Clase Empleado
    private int idEmpleado;
    private String nombrEmpleado;
    private String correoEmpleado;
    private Empresa empresaEmpleado;
    private String rolEmpleado;

    public Empleado(int idEmpleado, String nombrEmpleado, String correoEmpleado, Empresa empresaEmpleado, String rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombrEmpleado = nombrEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
        //Se añade la inicializacion para verificar el funcionamiento de la clase "MovimientoDinero"
        this.nombrEmpleado = "GenericoPruebas";
    }

    //Metodos
    public String empresaEmpleado(){
        return this.empresaEmpleado.getName();
    }

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

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
