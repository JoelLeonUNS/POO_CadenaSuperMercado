
package AccesoDatos;

import dominio.Linea;
import dominio.Producto;
import dominio.Ticket;

public class SqlDAOFactory extends AbstractDAOFactory {

    @Override
    public DAO<Producto> getProductoDAO() {
        return new ProductoDAO();
    }

    @Override
    public DAO<Linea> getLineaDAO() {
        return new LineaDAO();
    }

    @Override
    public DAO<Ticket> getTicketDAO() {
        return new TicketDAO();
    }
    
}
