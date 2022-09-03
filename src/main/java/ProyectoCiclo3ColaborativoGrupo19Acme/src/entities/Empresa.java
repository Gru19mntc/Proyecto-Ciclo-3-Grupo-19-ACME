package ProyectoCiclo3ColaborativoGrupo19Acme.src.entities;
import entities.Empleado;
import entities.MovimientoDinero;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "empresa")
@NoArgsConstructor
public class Empresa {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @Column(name = "name", unique = true) private String name;
    @Column(name = "document", unique = true) private String document;
    private String phone;
    private String adress;
    @OneToMany private entities.Empleado empleado;
    @OneToMany private entities.MovimientoDinero movimientoDinero;
    private Date createdAt;
    private Date updatedAt;
    //Constructor de la claseEmpresa
    public Empresa(long id, String name, String document, String phone, String adress, entities.Empleado empleado, entities.MovimientoDinero movimientoDinero, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.adress = adress;
        this.empleado = empleado;
        this.movimientoDinero = movimientoDinero;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }
    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
