package Punto1;

public class Autor{

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(){

    }

    public Autor(String nombre, String apellido, String email, char genero){
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getEmail(){
        return email;
    }
    public char getGenero(){
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }

    public String toString() {
        return "Punto1.Autor--> "+
                "nombre= " + nombre +
                ", apellido= " + apellido +
                ", email= " + email +
                ", genero= " + genero;
    }
}

