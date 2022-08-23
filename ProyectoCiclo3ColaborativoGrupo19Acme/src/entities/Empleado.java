package entities;

public class Empleado {
    //Creacion de la Clase Empleado
    private int idEmpleado;
    private String nombrEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;

    public Empleado(int idEmpleado, String nombrEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
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

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
