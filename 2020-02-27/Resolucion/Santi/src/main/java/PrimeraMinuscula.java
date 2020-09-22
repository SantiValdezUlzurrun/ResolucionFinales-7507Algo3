public class PrimeraMinuscula extends Efecto{

    public PrimeraMinuscula(){
        this.otroEfecto = new EfectoNulo();
    }

    public PrimeraMinuscula(Efecto unEfecto) {
        super(unEfecto);
    }

    @Override
    protected String aplicarMiEfecto(String unaCadena) {
        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }
}
