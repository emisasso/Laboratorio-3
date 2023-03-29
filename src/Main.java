import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'm');
        Autor autor2 = new Autor("Emiliano", "Sasso", "emi-sasso@hotmail.com", 'm');
        Autor autor3 = new Autor("Pablo", "Ortega", "PabloOrt@hotmail.com", 'm');
        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);
        Libro libro2 = new Libro("Effective Java", 450, 150, autor1, autor2, autor3);
        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);
        System.out.println(libro1.libro1autor());
        System.out.println(libro1.);
        libro1.setPrecio(500);
        libro1.setStock(200);
        System.out.println(libro1.libro1autor());
        System.out.println(libro1.imprimirLib());

        System.out.println(libro2.imprimirListAutores());



        }
    }
