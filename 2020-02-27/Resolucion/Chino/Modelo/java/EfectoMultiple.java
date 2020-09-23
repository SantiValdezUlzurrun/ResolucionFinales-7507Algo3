import java.util.ArrayList;
import java.util.List;

public class EfectoMultiple extends Efecto{

    private List<? extends Efecto> efectos;

    public EfectoMultiple(List<? extends Efecto> efectos){
        this.efectos = efectos;
    }

    protected String aplicarEfecto(String cadena){
        for (Efecto efecto :efectos){
            cadena = efecto.aplicarA(cadena);
        }
        return cadena;
    }
}
