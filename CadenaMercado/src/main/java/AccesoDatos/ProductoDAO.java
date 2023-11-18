
package AccesoDatos;

import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO<Producto>{

    @Override
    public Producto create(Producto obj) {
        BD.getProductos().put(BD.IdProducto(), obj);
        System.out.println("Producto creado.");
        return obj;
    }

    @Override
    public Producto read(int id) {
        return BD.getProductos().get(id);
    }

    @Override
    public Producto update(Producto obj) {
        System.out.println("Producto actualizado.");
        return BD.getProductos().replace(obj.getId()-1, obj);
    }

    @Override
    public void delete(Producto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> listado() {
        List<Producto> listaProductos = new ArrayList<>();
        
        for (int i = 0; i < BD.getProductos().size(); i++) {
            listaProductos.add(read(i));
        }        
        return listaProductos;
    }
    
    

}
