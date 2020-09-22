package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Salamandra implements ComponenteDomestico{
    private static final int  PESO_MAXIMO = 15;
    private int metrosCuadrados;
    private int pesoTotal;
    private List<Integer> costos = new ArrayList<Integer>();

    public Salamandra(int metrosCuadrados){
        this.metrosCuadrados = metrosCuadrados;
        this.pesoTotal = 0;
    }

    public void agregarMadera(int costo, Madera madera){
        if(pesoTotal + madera.calcularPeso(costo) > PESO_MAXIMO ){
            throw new NoHayEspacioParaTodaLaMaderaException();
        }
        pesoTotal += madera.calcularPeso(costo);
        costos.add(madera.calcularCosto(metrosCuadrados, costo));
    }

    public int getConsumo(){

        if(costos.size() == 0 ){return 0;}

        Iterator<Integer> iteradorMadera = costos.iterator();
        int gasto = 0;
        while (iteradorMadera.hasNext()){
            int costo = iteradorMadera.next();
            gasto += costo;
        }
        return gasto;
    }

}
