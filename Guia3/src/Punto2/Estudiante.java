package Punto2;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private LocalDate anioIngreso;
    private String carrera;
    private Integer cuotaMensual;

    public Estudiante() {
    }

    public Estudiante(String dni, String name, String surname, String email, String adress) {
        super(dni, name, surname, email, adress);
    }

    public Estudiante(String dni, String name, String surname, String email, String adress, LocalDate anioIngreso, String carrera, Integer cuotaMensual) {
        super(dni, name, surname, email, adress);
        this.anioIngreso = anioIngreso;
        this.carrera = carrera;
        this.cuotaMensual = cuotaMensual;
    }

    public LocalDate getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(LocalDate anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
}
