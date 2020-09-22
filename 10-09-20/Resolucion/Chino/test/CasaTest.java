import modelo.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasaTest {

    @Test
    public void test01UnaCasaEsEquipadaConUnaLosaYPuedeCalcularSuConsumoTotal(){
        Casa casa = new Casa();

        ComponenteDomestico losaRadiante = new LosaRadiante(10,20);
        casa.equipar(losaRadiante);

        assertEquals(casa.getGastoTotal(),4000);
    }

    @Test
    public void test02UnaCasaEsEquipadaConUnaLosaUnaCercaYUnaEstufaPuedeCalcularSuConsumoTotal(){
        Casa casa = new Casa();

        ComponenteDomestico losaRadiante = new LosaRadiante(10,20);
        ComponenteDomestico cercoElectrico = new CercoElectrico(10, 20);
        ComponenteDomestico estufa = new Estufa(1,10,100);

        casa.equipar(losaRadiante);
        casa.equipar(cercoElectrico);
        casa.equipar(estufa);

        assertEquals(casa.getGastoTotal(),4000+200 + 1000);
    }

    @Test
    public void test03UnaCasaEsEquipadaConUnaLosaUnaCercaUnaSalamandraYUnaEstufaPuedeCalcularSuConsumoTotal(){
        Casa casa = new Casa();

        ComponenteDomestico losaRadiante = new LosaRadiante(10,20);
        ComponenteDomestico cercoElectrico = new CercoElectrico(10, 20);
        ComponenteDomestico estufa = new Estufa(1,10,100);

        Quebracho quebracho = new Quebracho();
        PinoCuesta pinoCuesta = new PinoCuesta();

        Salamandra salamandra = new Salamandra(4);

        //Agrego 40$ de quebracho ---> 10 kg
        salamandra.agregarMadera(40, quebracho);
        //Agrego 6$ de pinoCuesta ---> 3 kg
        salamandra.agregarMadera(6, pinoCuesta);

        casa.equipar(salamandra);
        casa.equipar(losaRadiante);
        casa.equipar(cercoElectrico);
        casa.equipar(estufa);

        assertEquals(casa.getGastoTotal(),4000 + 200 + 1000 + 84);
    }
}
