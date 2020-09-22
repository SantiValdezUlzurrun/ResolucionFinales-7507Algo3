import modelo.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComponenteDomesticoTest {

    @Test
    public void test01LosaRadiantePuedeCalcularSuConsumo(){

        //Consumo se calcula como precioKw * metros * metros

        LosaRadiante losaRadiante = new LosaRadiante(10,20);

        assertEquals(losaRadiante.getConsumo(),4000);
    }

    @Test
    public void test02CercaElectricaPuedeCalcularSuConsumo(){

        //Consumo se calcula como precioKw * metros

        CercoElectrico cercoElectrico = new CercoElectrico(10, 20);

        assertEquals(cercoElectrico.getConsumo(),200);

    }

    @Test
    public void test03EstufaPuedeCalcularSuConsumo(){

        //Consumo se calcula como precioKw * calorias * ambientes

        Estufa estufa = new Estufa(1,10,100);

        assertEquals(estufa.getConsumo(),1000);
    }

    @Test
    public void test04SalamandraPuedeCalcularSuCostoSiLeDanUnaMaderaQuebracho(){

        Quebracho quebracho = new Quebracho();

        Salamandra salamandra= new Salamandra(4);

        salamandra.agregarMadera(40, quebracho);

        assertEquals(salamandra.getConsumo(),80);
    }

    @Test
    public void test05SalamandraPuedeCalcularSuCostoSiColocoVariasMaderas(){
        Quebracho quebracho = new Quebracho();
        PinoCuesta pinoCuesta = new PinoCuesta();

        Salamandra salamandra= new Salamandra(4);

        //Agrego 40$ de quebracho ---> 10 kg
        salamandra.agregarMadera(40, quebracho);
        //Agrego 6$ de pinoCuesta ---> 3 kg
        salamandra.agregarMadera(6, pinoCuesta);

        // consumo: quebracho (10*4*2)=80 + pinoCuesta (4 * 3)/3
        assertEquals(salamandra.getConsumo(),84);
    }

    @Test
    public void test06SalamandraSiSuperaElMaximoDeCapacidadLanzaUnaExcepcion(){
        Quebracho quebracho = new Quebracho();
        PinoCuesta pinoCuesta = new PinoCuesta();

        Salamandra salamandra= new Salamandra(4);

        //Agrego 40$ de quebracho ---> 10 kg
        salamandra.agregarMadera(40, quebracho);
        //Agrego 6$ de pinoCuesta ---> 3 kg
        salamandra.agregarMadera(6, pinoCuesta);

        assertThrows(NoHayEspacioParaTodaLaMaderaException.class, ()->{
            salamandra.agregarMadera(40,quebracho);
        });
    }
}
