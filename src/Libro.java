public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor autor1;
    private Autor autor2;
    private Autor autor3;

    public Libro(){

    }

    public Libro(String titulo, double precio, int stock, Autor autor1){
        this.autor1 = autor1;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public Libro(String titulo, double precio, int stock, Autor autor1, Autor autor2, Autor autor3){
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.autor3 = autor3;
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

    public Autor getAutor1() {
        return autor1;
    }
    public void setAutor1(Autor autor1) {
        this.autor1 = autor1;
    }

    public Autor getAutor2(){
        return autor2;
    }
    public void setAutor2(Autor autor2){
        this.autor2 = autor2;
    }

    public Autor getAutor3(){
        return autor3;
    }
    public void setAutor3(Autor autor3){
        this.autor3 = autor3;
    }

    public String libro1autor(){
        return "Libro--> "+"Titulo= "+titulo+
                ", autor= "+ autor1.getNombre()+" "+autor1.getApellido()+
                ", precio= "+precio+
                ", stock= "+stock;
    }

    public String imprimirLib(){
        return "El libro, "+titulo+" de "+autor1.getNombre()+" se vende a $"+precio+" pesos.";
    }

    public String imprimirListAutores(){
        return "El libro, "+titulo+" de "+autor1.getNombre()+", "+autor2.getNombre()+" y "+autor3.getNombre()+" se vende a $"+precio+" pesos.";
    }
}
