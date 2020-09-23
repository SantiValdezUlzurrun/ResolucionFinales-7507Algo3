public class PrimeraMayuscula extends Efecto{

    protected String aplicarEfecto(String unaCadena) {

        String nuevoString = unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);
        return nuevoString;
    }

}
