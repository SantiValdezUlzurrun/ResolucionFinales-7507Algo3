import java.util.List;
import java.util.ArrayList;

public class Salamandra implements Consumista {
    private int metrosCuadrados;
    private final int CAPACIDAD_MAXIMA_PESO = 15;

    private List<Combustible> combustibles = new ArrayList<Combustible>();

    public Salamandra(int metrosCuadrados){
        if(metrosCuadrados < 0){
            throw new ValorInvalidoException();
        }
        this.metrosCuadrados = metrosCuadrados;
    }

    public void agregarCombustible(Combustible combustible){
        if(this.pesoActual() + combustible.peso() > CAPACIDAD_MAXIMA_PESO){
            throw new SalamandraCompletaException();
        }
        combustibles.add(combustible);
    }

    public int consumo(){
        int consumo = 0;
        for(Combustible combustible : combustibles){
            consumo = consumo + combustible.calcularCostoPara(metrosCuadrados);
        }
        return consumo;
    }

    private int pesoActual(){
        int pesoActual = 0;
        for(Combustible combustible : combustibles){
            pesoActual = pesoActual + combustible.peso();
        }
        return pesoActual;
    }
}