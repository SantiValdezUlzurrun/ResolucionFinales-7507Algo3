public class AgregarSufijoAlFinal extends Efecto{
    private String sufijo;

    public AgregarSufijoAlFinal(String sufijo){
        this.sufijo = sufijo;
    }

    protected String aplicarEfecto(String unaCadena) {

        String nuevoString = unaCadena + sufijo;
        return nuevoString;
    }
}
