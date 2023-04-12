package Punto3;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String name;
    private char sexo;


    public Cliente() {
    }

    public Cliente(String name, char sexo) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.sexo = sexo;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
