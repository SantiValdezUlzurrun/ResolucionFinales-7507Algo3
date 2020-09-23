public class DarVuelta extends Efecto{

    protected String aplicarEfecto(String unaCadena) {

        String nuevoString = new StringBuffer(unaCadena).reverse().toString();
        return nuevoString;
    }
}
