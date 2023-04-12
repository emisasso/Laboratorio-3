package Punto1;

public class Cilindro extends Circulo{
    private double altura = 1.0;


    public Cilindro() {super();}
    public Cilindro(double radio, String color) {
        super(radio, color);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (2*Math.PI*this.altura*super.getRadio()+(2*super.calcularArea()));
    }

    public double calcularVolumen(){
        return (Math.PI*this.altura*(Math.pow(super.getRadio(),2)));
    }

    @Override
    public String toString() {
        return "Cilindro-->" +
                " radio= " + getRadio() +
                " altura= " + altura +
                " area= " + calcularArea() +
                " volumen= " + calcularVolumen();
    }
}
