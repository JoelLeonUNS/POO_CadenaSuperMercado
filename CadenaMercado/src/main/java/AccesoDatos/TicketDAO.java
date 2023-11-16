
package AccesoDatos;

import dominio.Ticket;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO extends DAO<Ticket>{

    @Override
    public Ticket create(Ticket obj) {
        BD.getTickets().put(BD.IdTicket(), obj);
        System.out.println("Ticket creado.");
        return obj;
    }

    @Override
    public Ticket read(int id) {
        return BD.getTickets().get(id);
    }

    @Override
    public Ticket update(Ticket obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Ticket obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Ticket> listado() {
        List<Ticket> listaTickets = new ArrayList<>();
        
        for (int i = 0; i < BD.getTickets().size(); i++) {
            listaTickets.add(read(i));
        }        
        return listaTickets;
    }

}
