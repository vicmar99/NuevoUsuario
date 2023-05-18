package nuevousuario;

public class Bean {
    
    private static ModelBean modelBean = new ModelBean();
    
    public static boolean nuevoUsuario(Usuario usuario){
        return modelBean.save(usuario);
    }
}
