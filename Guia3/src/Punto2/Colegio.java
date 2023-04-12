package Punto2;

import java.util.ArrayList;

public class Colegio {
    private ArrayList <Persona> colegio;


    public Colegio() {
        this.colegio = new ArrayList<>();
    }

    public ArrayList<Persona> getColegio() {
        return colegio;
    }

    public void setColegio(ArrayList<Persona> colegio) {
        this.colegio = colegio;
    }

    public void addPerson (Persona person1){
        colegio.add(person1);
    }

    public void cantPersonalColegio(ArrayList <Persona> lista){
        Integer cantAlumnos = 0;
        Integer cantEmpleados = 0;
        for (Persona arreglo : lista){
            if(arreglo instanceof Estudiante)
            {
                cantAlumnos++;
            }
            else
            {
                cantEmpleados++;
            }
        }
        System.out.println("La cantidad de alumnos "+ cantAlumnos + " Cantidad de empleados " + cantEmpleados);
    }


    public void ingresosColegio(ArrayList <Persona> lista){
        Integer total = 0;
        for(Persona arreglo : lista){
            if(arreglo instanceof Estudiante) {
                total += ((Estudiante) arreglo).getCuotaMensual();
            }
        }
        System.out.println("El ingreso total del colegio es $"+total);
    }


}
