public class AgregarNumeroAlFinal extends Efecto {

    private int numero;

    public AgregarNumeroAlFinal(int unNumero){
        this.otroEfecto = new EfectoNulo();
        this.numero = unNumero;
    }

    public AgregarNumeroAlFinal(Efecto unEfecto, int unNumero){
        super(unEfecto);
        this.numero = unNumero;
    }

    @Override
    protected String aplicarMiEfecto(String unaCadena) {
        return unaCadena + this.numero;
    }
}
