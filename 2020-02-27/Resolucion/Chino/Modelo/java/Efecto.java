public abstract class Efecto {

    public String aplicarA(String cadena){
        if (cadena.equals("")) {
            throw new StringInvalidoException();
        }
        return  aplicarEfecto(cadena);
    }

    protected abstract String aplicarEfecto(String cadena);
}
