package Punto2;
import java.util.UUID;
public class Cliente {
    //region Atributos
    private UUID id;
    private String name;
    private String email;
    private double descuento;
    //endregion
    public Cliente(){ };

    public Cliente(String name, String email, double descuento){
        this.descuento = descuento;
        this.name = name;
        this.email = email;
        this.id = UUID.randomUUID();
    }
    //region GetANDset
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    //endregion

    @Override
    public String toString() {
        return "Cliente--> " +
                "id= " + id +
                " name= " + name +
                " email= " + email +
                " descuento= " + descuento +
                "<--";
    }


}
