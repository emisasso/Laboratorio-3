package Punto3;

import java.util.UUID;

public class Cuenta {
    private UUID id;
    private double balance;
    private  Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(double balance, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", balance=" + balance +
                ", cliente=" + cliente +
                '}';
    }

    public void extraccion(double montoExtraccion)
    {
        if(montoExtraccion > this.balance)
        {
            System.out.println("El valor de extraccion es mayor a la cuenta");
        }
        else {
            this.balance = this.balance - montoExtraccion;
        }
    }

    public void deposito(double montoDeposito)
    {
        this.balance = this.balance + montoDeposito;
    }


}
