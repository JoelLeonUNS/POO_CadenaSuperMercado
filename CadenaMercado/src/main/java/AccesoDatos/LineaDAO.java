
package AccesoDatos;

import dominio.Linea;
import java.util.ArrayList;
import java.util.List;

public class LineaDAO extends DAO<Linea> {

    @Override
    public Linea create(Linea obj) {
        BD.getLineas().put(BD.IdLinea(), obj);
        System.out.println("Linea creada.");
        return obj;
    }

    @Override
    public Linea read(int id) {
        return BD.getLineas().get(id);
    }

    @Override
    public Linea update(Linea obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Linea obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Linea> listado() {
        List<Linea> listaLineas = new ArrayList<>();
        
        for (int i = 0; i < BD.getLineas().size(); i++) {
            listaLineas.add(read(i));
        }        
        return listaLineas;
    }

}
