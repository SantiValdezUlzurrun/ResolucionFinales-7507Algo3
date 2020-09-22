import java.util.ArrayList;
import java.util.List;

public class Casa {

    public List<Consumista> componentes = new ArrayList<Consumista>();

    public int getGastoTotal() {

        int gasto = 0;
        for (Consumista componente : componentes){
            gasto = gasto + componente.consumo();
        }
        return gasto;
    }

    public void agregarComponente(Consumista consumista){
        componentes.add(consumista);
    }
}

