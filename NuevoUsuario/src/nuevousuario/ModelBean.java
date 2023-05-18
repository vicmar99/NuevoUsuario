package nuevousuario;

import java.util.ArrayList;
import java.util.List;

public class ModelBean {

    private List<Usuario> usuarios;

    public ModelBean() {
        usuarios = new ArrayList<>();
    }

    public int buscar(String correo) {
        int n = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(correo)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean nuevoUsuario(Usuario usuario) {
        if (buscar(usuario.getCorreo()) == -1) {
            usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarUsuario(Usuario usuario) {
        if (buscar(usuario.getCorreo()) != -1) {
            Usuario usuarioMod = obtenerUsuario(usuario.getCorreo());

            usuarioMod.setPassword(usuario.getPassword());
            usuarioMod.setNombres(usuario.getNombres());
            usuarioMod.setApellidos(usuario.getApellidos());

            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarUsuario(String usuario) {
        if (buscar(usuario) != -1) {
            usuarios.remove(buscar(usuario));
            return true;
        } else {
            return false;
        }
    }

    public Usuario obtenerUsuario(String usuario) {
        if (buscar(usuario) != -1) {
            return usuarios.get(buscar(usuario));
        } else {
            return null;
        }
    }
}
