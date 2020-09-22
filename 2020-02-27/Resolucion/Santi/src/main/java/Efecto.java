public abstract class Efecto {

    protected Efecto otroEfecto;

    public Efecto(){}

    public Efecto(Efecto unEfecto){
        this.otroEfecto = unEfecto;
    }

    public void agregarEfecto(Efecto unEfecto){
        otroEfecto.agregarEfecto(unEfecto);
    }

    public String aplicar(String unaCadena){
        if (unaCadena.equals("")) {
            throw new CadenaVaciaAlAplicarEfectoException();
        }
        return otroEfecto.aplicar(this.aplicarMiEfecto(unaCadena));
    }

    protected abstract String aplicarMiEfecto(String unaCadena);

}
