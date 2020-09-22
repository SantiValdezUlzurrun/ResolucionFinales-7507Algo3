public class PrimeraMayuscula extends Efecto{

    public PrimeraMayuscula(){
        this.otroEfecto = new EfectoNulo();
    }

    public PrimeraMayuscula(Efecto unEfecto) {
        super(unEfecto);
    }

    @Override
    protected String aplicarMiEfecto(String unaCadena) {
        return unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);
    }
}
