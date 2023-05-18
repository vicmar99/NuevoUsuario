package nuevousuario;

public class Bean {
    
    private static ModelBean modelBean = new ModelBean();

    public static boolean nuevoUsuario(Usuario usuario) {
        return modelBean.nuevoUsuario(usuario);
    }
    
    public static boolean modificarUsuario(Usuario usuario){
        return modelBean.modificarUsuario(usuario);
    }
    
    public static boolean eliminarUsuario(String usuario){
        return modelBean.eliminarUsuario(usuario);
    }
    
    public static Usuario obtenerUsuario(String usuario){
        return modelBean.obtenerUsuario(usuario);
    }
    
    public static boolean consultarUsuario(String Usuario) {
        if (obtenerUsuario(Usuario) != null) {
            Usuario usuariConsulta = obtenerUsuario(Usuario);
            if (usuariConsulta.getCorreo().equals(Usuario)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
