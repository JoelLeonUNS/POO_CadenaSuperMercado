
package AccesoDatos;

import dominio.Linea;
import dominio.Producto;
import dominio.Ticket;
import java.util.HashMap;
import java.util.Map;

public class BD {
    private static int idProducto;
    private static int idLinea;
    private static int idTicket;
    private static final Map<Integer, Producto> productos = new HashMap<>();
    private static final Map<Integer, Linea> lineas = new HashMap<>();
    private static final Map<Integer, Ticket> tickets = new HashMap<>();

    public static Map<Integer, Producto> getProductos() {
        return productos;
    }
    
    public static int IdProducto() {
        return idProducto++;
    }
    
    public static Map<Integer, Linea> getLineas() {
        return lineas;
    }
    
    public static int IdLinea() {
        return idLinea++;
    }
    
    public static Map<Integer, Ticket> getTickets() {
        return tickets;
    }
    
    public static int IdTicket() {
        return idTicket++;
    }
}
