import Punto1.Autor;
import Punto1.Libro;
import Punto2.Factura;
import Punto3.Cliente;
import Punto3.Cuenta;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        // Punto 1
        /*
        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'm');
        Autor autor2 = new Autor("Emiliano", "Sasso", "emi-sasso@hotmail.com", 'm');
        Autor autor3 = new Autor("Pablo", "Ortega", "PabloOrt@hotmail.com", 'm');
        Autor[] autores ={autor1, autor2, autor3};
        Autor[] autorSolo = {autor1};
        Libro libro1 = new Libro("Effective Java", 450, 150, autorSolo);
        Libro libro2 = new Libro("Effective Java", 450, 150, autores);
        System.out.println(autorSolo);
        libro1.setPrecio(500);
        libro1.setStock(200);
        System.out.println(libro1.libro1autor());
        System.out.println(libro1.imprimirLib());
        */

        //Punto 2
        /*
        Cliente cliente1 = new Cliente("emiliano", "emisasso@hotmail.com", 20);
        Factura factura1 = new Factura(5000, LocalDate.of(1996, 1, 25), cliente1);

        System.out.println(factura1.imprimFactura());
        */

        //Punto 3
        Cliente cliente1 = new Cliente("Emiliano", 'm');
        System.out.println(cliente1.toString());

        Cuenta cuenta1 = new Cuenta(10000, cliente1);
        System.out.println(cuenta1.toString());
        cuenta1.deposito(5000);
        System.out.println(cuenta1.toString());
        cuenta1.extraccion(16000);
        System.out.println(cuenta1.toString());
    }
}