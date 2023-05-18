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

    public boolean save(Usuario usuario) {
        if (buscar(usuario.getCorreo()) == -1) {
            usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }
}
