public class DarVuelta extends Efecto {

    public DarVuelta(){
        this.otroEfecto = new EfectoNulo();
    }

    public DarVuelta(Efecto unEfecto) {
        super(unEfecto);
    }

    @Override
    protected String aplicarMiEfecto(String unaCadena) {
        return new StringBuffer(unaCadena).reverse().toString();
    }
}
