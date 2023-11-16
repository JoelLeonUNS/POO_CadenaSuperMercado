package persistencia;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
    public Connection conector;
    public abstract T create(T obj);
    public abstract T read(int id);
    public abstract T update(T obj);
    public abstract T delete(T obj);
    public abstract List<T> listed(); 
}
