
package AccesoDatos;

import java.util.List;

public abstract class DAO<T> {
    
    //public Connection connect = ConnectionSql.getInstancia();
    
    public abstract T create(T obj);
    public abstract T read(int id);
    public abstract T update(T obj);
    public abstract void delete(T obj);
    public abstract List<T> listado();
}
