package Punto2;


import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private UUID id;
    private double total;
    private LocalDate date;
    private Cliente cliente;


    public Factura() {
    }

    public Factura(double total, LocalDate date, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.total = total;
        this.date = date;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", date=" + date +
                ", total=" + total +
                ", cliente--> " + cliente +
                '}';
    }

    public double totalConDesc(){
        return total-(total*cliente.getDescuento())/100;
    }

    public String imprimFactura() {
        return "Factura--> " +
                "id= " + id +
                " date= " + date +
                " total= " + total +
                " total con descuento= "+totalConDesc()+
                " cliente= " + cliente;
    }





}
