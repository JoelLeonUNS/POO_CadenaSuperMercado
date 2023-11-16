package dominio;

import persistencia.DAO;
import persistencia.UsuarioDAO;

public class ModeloLogin {

    private boolean acceso;
    private Usuario usuario;

    public ModeloLogin() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void iniciarSesion() {
        DAO<Usuario> uDAO = new UsuarioDAO();
        for (Usuario user : uDAO.listed()) {
            if (user.getUsuario().equals(usuario.getUsuario()) && user.getClave().equals(usuario.getClave())) {
                acceso = true;
                break;
            } else {
                acceso = false;
            }
        }
    }

}
