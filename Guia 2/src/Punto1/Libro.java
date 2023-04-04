package Punto1;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor autor [];

    public Libro(){

    }

    public Libro(String titulo, double precio, int stock, Autor autor[]){
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutor() {
        return autor;
    }
    public void setAutor(Autor autor[]) {
        this.autor = autor;
    }

    public String libro1autor(){
        return "Punto1.Libro--> "+"Titulo= "+titulo+
                ", autor= "+Arrays.toString(autor)+
                ", precio= "+precio+
                ", stock= "+stock;
    }

    public String imprimirLib() {
        return "El libro, " + titulo + " de " + autor[5].getNombre() + " se vende a $" + precio + " pesos.";
    }
}
