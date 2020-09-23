public class PrimeroMinuscula extends Efecto{

    protected String aplicarEfecto(String unaCadena) {

        String nuevoString = unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
        return nuevoString;
    }

}
