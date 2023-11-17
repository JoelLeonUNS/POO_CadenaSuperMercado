
package dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Ticket {
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private String mensaje;
    private ArrayList<Linea> lineas = new ArrayList<>();

    public Ticket() {
        cliente = new Cliente();
    }
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }
    
    
}
