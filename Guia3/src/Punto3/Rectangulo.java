package Punto3;

public class Rectangulo {
    private double radio;
    private double alto;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double radio, double alto, double largo) {
        this.radio = radio;
        this.alto = alto;
        this.largo = largo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double calculoArea(){
        return largo*alto;
    }

    public double calculoPerimetro(){
        return (2*largo)+(2*alto);
    }

}
