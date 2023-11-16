
package AccesoDatos;

/*import Dominio.Alquiler;
import Dominio.Cliente;
import Dominio.Vehiculo;*/

public abstract class AbstractDAOFactory {
    
    //public abstract DAO<Vehiculo> getVehiculoDAO();
    //public abstract DAO<Alquiler> getAlquilerDAO();
    //public abstract DAO<Cliente> getClienteDAO();
    
    public static AbstractDAOFactory getFactory(FactoryType type){
        if(type.equals(FactoryType.SqlDAOFactory)){
            //return new SqlDAOFactory();        
        } 
        return null;
    }
}
