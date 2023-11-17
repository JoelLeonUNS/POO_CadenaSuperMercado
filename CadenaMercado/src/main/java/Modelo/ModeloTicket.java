package Modelo;

import AccesoDatos.TicketDAO;
import dominio.Linea;
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
    
    public String visualizarCliente() {
        return "Dni: " + ticket.getCliente().getDni();
    }
    
    public int nroLineas() {
        return ticket.getLineas().size() + 1;
    }

    // Agrega una nueva linea
    public void agregarLinea(Linea linea) {
        ticket.getLineas().add(linea);
    }

    // Aplica un descuento a todas las ventas
    public double aplicarDescuento(double porcentaje) {
        return calcularTotal()*porcentaje;
    }
    
    // Calcula el total de las ventas
    public double calcularTotal() {
        double total = 0;
        for (Linea linea : ticket.getLineas()) {
            total += linea.calcularSubtotal();
        }
        return total;
    }
    
    public void finalizar() {
        tDAO.create(ticket);
        ticket = new Ticket(); // reset
    }

    // Imprime el total de las ventas
    public void imprimir() {
        System.out.println("El total de las ventas es: " + calcularTotal());
    }
    
    
}
