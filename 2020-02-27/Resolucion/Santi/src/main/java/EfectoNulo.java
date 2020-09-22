public class EfectoNulo extends Efecto{

    public EfectoNulo(){
        this.otroEfecto = null;
    }

    @Override
    public void agregarEfecto(Efecto unEfecto){
        this.otroEfecto = unEfecto;
    }

    @Override
    public String aplicar(String unaCadena){
        return this.aplicarMiEfecto(unaCadena);
    }

    @Override
    protected String aplicarMiEfecto(String unaCadena){
        return unaCadena;
    }
}
