package Modelo;

import AccesoDatos.TicketDAO;
import dominio.Ticket;

public class ModeloTicket {

    private Ticket ticket;
    private TicketDAO tDAO;

    public ModeloTicket() {
        ticket = new Ticket();
        tDAO = new TicketDAO();
    }


    // Agrega un cliente
    public void agregarCliente(String nombre, String apellido, String dni) {
        ticket.getCliente().setNombre(nombre);
        ticket.getCliente().setApellido(apellido);
        ticket.getCliente().setDni(dni);
    }

    // Visualiza la lista de clientes
    public void visualizar() {
        
    }

    // Calcula el total de las ventas
    public double calcularTotal() {
        return 0;
    }

    // Imprime el total de las ventas
    public void imprimir() {
        System.out.println("El total de las ventas es: " + calcularTotal());
    }

    // Agrega una venta a la lista de ventas
    public void agregarVenta() {
        
    }

    // Anula una venta de la lista de ventas
    public void anular() {
        
    }

    // Repite una venta un número determinado de veces
    public void repetir() {

    }

    // Aplica un descuento a todas las ventas
    public void aplicarDescuento() {
    }
}
