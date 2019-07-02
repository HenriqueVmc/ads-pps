package ex3singleton;

public class Sistema {

    public static Sistema instancia;
    
    private String usuarioAutenticado;

    protected Sistema() {
    }

    public String getUsuarioAutenticado() {
        return this.usuarioAutenticado;
    }

    public void setUsuarioAutenticado(String usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public static Sistema getInstancia() {
        return (instancia == null) ? instancia = new Sistema(): instancia;
    }
}
