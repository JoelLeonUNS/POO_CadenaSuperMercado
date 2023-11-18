package Modelo;

import AccesoDatos.TicketDAO;
import dominio.Linea;
import dominio.Ticket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ModeloTicket {

    private Ticket ticket;
    private TicketDAO tDAO;

    public ModeloTicket() {
        ticket = new Ticket();
        tDAO = new TicketDAO();
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public LocalDate getFecha() {
        return ticket.getFecha();
    }
    
    public void setFecha(LocalDate fecha) {
        ticket.setFecha(fecha);
    }

    public LocalTime getHora() {
        return ticket.getHora();
    }
    
    public void setHora(LocalTime hora) {
        ticket.setHora(hora);
    }
    
    public String getNombre() {
        return ticket.getCliente().getNombre();
    }
    
    public void setNombre(String nombre) {
        ticket.getCliente().setNombre(nombre);
    }

    public String getApellido() {
        return ticket.getCliente().getApellido();
    }
    
    public void setApellido(String apellido) {
        ticket.getCliente().setApellido(apellido);
    }

    public String getDni() {
        return ticket.getCliente().getDni();
    }
    
    public void setDni(String DNI) {
        ticket.getCliente().setDni(DNI);
    }
    
    public double getDescuentoTotal() {
        return ticket.getDescuentoTotal();
    }

    public double getTotal() {
        return ticket.getTotal();
    }

    // Agrega un cliente
    public void agregarCliente(String nombre, String apellido, String dni) {
        ticket.getCliente().setNombre(nombre);
        ticket.getCliente().setApellido(apellido);
        ticket.getCliente().setDni(dni);
    }
    
    public Linea getLinea(int indice) {
        return ticket.getLineas().get(indice);
    }
    
    public int nroLineas() {
        return ticket.getLineas().size();
    }
    
    public ArrayList<Linea> getLineas() {
        return ticket.getLineas();
    }
    
    public String getTipoLinea(int indice) {
        return ticket.getLineas().get(indice).getClass().getSimpleName();
    }

    // Agrega una nueva linea
    public void agregarLinea(Linea linea) {
        ticket.getLineas().add(linea);
    }

    // Aplica un descuento a todas las ventas
    public void aplicarDescuento(double porcentaje) {
        ticket.setDescuentoTotal(ticket.getTotal()*porcentaje);
    }
    
    // Calcula el total de las ventas
    public double calcularTotal() {
        double total = 0;
        for (Linea linea : ticket.getLineas()) {
            total += linea.calcularSubtotal();
        }
        ticket.setTotal(total);
        return total;
    }
    
    public void finalizar() {
        tDAO.create(ticket);
        ticket = new Ticket(); // reset
    }

    public void getTicketBD() { // el ultimo
        ticket =  tDAO.read(tDAO.count());
    }
    
    public void getTicketBD(int indice) {
        ticket = tDAO.read(indice);
    }
    
}
