package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Casa {

    public List<ComponenteDomestico> ComponenteDomestico = new ArrayList<ComponenteDomestico>();

    public void equipar(ComponenteDomestico ComponenteDomestico){
        this.ComponenteDomestico.add(ComponenteDomestico);
    }

    public int getGastoTotal() {

        int gasto = 0;

        Iterator<ComponenteDomestico> iterador = ComponenteDomestico.iterator();

        while (iterador.hasNext()){
            ComponenteDomestico componente = iterador.next();
            gasto += componente.getConsumo();
        }
        return gasto;
    }

}

