
package AccesoDatos;

import dominio.Linea;
import dominio.Producto;
import dominio.Ticket;

public abstract class AbstractDAOFactory {
    
    public abstract DAO<Producto> getProductoDAO();
    public abstract DAO<Linea> getLineaDAO();
    public abstract DAO<Ticket> getTicketDAO();
    
    public static AbstractDAOFactory getFactory(FactoryType type){
        if(type.equals(FactoryType.SqlDAOFactory)){
            return new SqlDAOFactory();        
        } 
        return null;
    }
}
