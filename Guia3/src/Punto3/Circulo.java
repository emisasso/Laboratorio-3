package Punto3;

public class Circulo {
    private double radio;
    private double alto;
    private double largo;

    public Circulo() {
    }

    public Circulo(double radio, double alto, double largo) {
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
        return (Math.PI*(Math.pow(radio, 2)));
    }
    public double calculoPerimetro(){
        return 2*Math.PI*radio;
    }

}
