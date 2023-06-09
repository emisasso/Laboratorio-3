package Punto2;

public abstract class Persona {
    private String dni;
    private String name;
    private String surname;
    private String email;
    private String adress;

    public Persona() {
    }

    public Persona(String dni, String name, String surname, String email, String adress) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.adress = adress;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
