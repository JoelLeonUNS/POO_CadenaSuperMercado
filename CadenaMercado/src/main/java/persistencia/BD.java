
package persistencia;

import dominio.Usuario;
import java.util.HashMap;
import java.util.Map;

public class BD {
    private static int idUsuario;
    private static final Map<Integer, Usuario> usuarios = new HashMap<>();

    public static Map<Integer, Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static int IdUsuario() {
        return idUsuario++;
    }
}
