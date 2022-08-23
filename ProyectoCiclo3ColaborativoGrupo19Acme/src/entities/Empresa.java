package entities;

public class Empresa {

    private String name;
    private String adress;
    private int telf;
    private int nit;
    //Constructor de la claseEmpresa
    public Empresa(String name, String adress, int telf, int nit) {
        this.name = name;
        this.adress = adress;
        this.telf = telf;
        this.nit = nit;
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
}
