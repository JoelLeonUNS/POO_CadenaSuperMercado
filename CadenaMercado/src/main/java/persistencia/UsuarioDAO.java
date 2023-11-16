
package persistencia;

import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends DAO<Usuario> {

    @Override
    public Usuario create(Usuario obj) {
        BD.getUsuarios().put(BD.IdUsuario(), obj);
        System.out.println("Usuario creado: " + obj.getUsuario() + "  |  " + obj.getClave());
        return obj;
    }

    @Override
    public Usuario delete(Usuario obj) {
        return null;
    }

    @Override
    public Usuario update(Usuario obj) {
        return null;
    }

    @Override
    public Usuario read(int id) {
        return BD.getUsuarios().get(id);
    }

    @Override
    public List<Usuario> listed() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        
        for (int i = 0; i < BD.getUsuarios().size(); i++) {
            listaUsuarios.add(read(i));
        }        
        return listaUsuarios;
    }

}
