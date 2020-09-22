import org.junit.Test;

public class CasaTest {

    @Test
    public void test() {
        Casa casa = new Casa();
        casa.agregarComponente(new Estufa (1, 10, 1000));
        casa.agregarComponente(new Losa(10, 10));
        casa.agregarComponente(new CercoElectrico(10,10));
        org.junit.Assert.assertEquals(11100, casa.getGastoTotal());
    }

    @Test
    public void test01UnaEstufaCalculaCorrectamenteElConsumo(){
        Consumista estufa = new Estufa(1, 5, 10);
        org.junit.Assert.assertEquals(50, estufa.consumo());
    }

    @Test
    public void test02UnaLosaCalculaCorrectamenteElConsumo(){
        Consumista losa = new Losa(40, 3);
        org.junit.Assert.assertEquals(360, losa.consumo());
    }

    @Test
    public void test03UnCercoElectricoCalculaCorrectamenteElConsumo(){
        Consumista cercoElectrico = new CercoElectrico(10, 20);
        org.junit.Assert.assertEquals(200, cercoElectrico.consumo());
    }

    @Test
    public void test04UnaEstufaNoSePuedeCrearConCantidadDeAmbientesNegativa(){
        org.junit.Assert.assertThrows(ValorInvalidoException.class, ()->{
            Estufa estufita = new Estufa(-1, 3, 40);
        });
    }

    @Test
    public void test05UnaSalamandraConSolo10KilosDeQuebrachoCalculaCorrectamenteElConsumo(){
        Salamandra salamandra = new Salamandra(20);
        salamandra.agregarCombustible(new BolsaDeQuebracho(10));
        org.junit.Assert.assertEquals(440, salamandra.consumo());
    }

    @Test
    public void test06UnaSalamandraCon3KilosDeQuebrachoY3DePinoCalculaCorrectamenteElConsumo(){
        Salamandra salamandra = new Salamandra(20);
        salamandra.agregarCombustible(new BolsaDeQuebracho(3));
        salamandra.agregarCombustible(new BolsaDePino(3));
        org.junit.Assert.assertEquals(158, salamandra.consumo());
    }

    @Test
    public void test07UnaBolsaDeQuebrachoCalculaCorrectamenteSuConsumoPara20MetrosCuadrados(){
        Combustible bolsaDeQuebracho = new BolsaDeQuebracho(10); //10 Kilogramos.
        org.junit.Assert.assertEquals(440, bolsaDeQuebracho.calcularCostoPara(20));
    }

    @Test
    public void test08UnaBolsaDeQuebrachoRespondeCorrectamenteAlMensajePeso(){
        Combustible bolsaDeQuebracho = new BolsaDeQuebracho(10);
        org.junit.Assert.assertEquals(10, bolsaDeQuebracho.peso());
    }

    @Test
    public void test09UnaBolsaDePinoCalculaCorrectamenteSuConsumoPara20MetrosCuadrados() {
        Combustible bolsaDePino = new BolsaDePino(9);
        org.junit.Assert.assertEquals(78, bolsaDePino.calcularCostoPara(20));
    }

    @Test
    public void test10UnaSalamandraLanzaLaExcepcionSalamandraCompletaExceptionCuandoSeIntentaLLenarConMasDe15Kilogramos(){
        Salamandra salamandra = new Salamandra(3);
        salamandra.agregarCombustible(new BolsaDePino(10));
        org.junit.Assert.assertThrows(SalamandraCompletaException.class, ()->{
           salamandra.agregarCombustible(new BolsaDeQuebracho(6));
        });
    }

    @Test
    public void UnaSalamandraVaciaTieneConsumoCero(){
        Salamandra salamandra = new Salamandra(20);
        org.junit.Assert.assertEquals(0, salamandra.consumo());
    }

    @Test
    public void testFinalIntegradorDeUnaCasa(){
        Casa casa = new Casa();
        casa.agregarComponente(new Estufa(3, 10, 5)); // 3*10*5  = 150
        casa.agregarComponente(new Estufa(1, 10, 5)); // 1*10*5  = 50
        casa.agregarComponente(new Losa(5, 8));                        // 5*8*8   = 320
        casa.agregarComponente(new CercoElectrico(50, 10));            // 50*10   = 500

        Salamandra salamandra = new Salamandra(10);
        salamandra.agregarCombustible(new BolsaDeQuebracho(7));              // 4*7+7*10*2 = 168
        salamandra.agregarCombustible(new BolsaDePino(6));                   // 2*6+10*6/3 = 32

        casa.agregarComponente(salamandra);                                            //            = 200

        org.junit.Assert.assertEquals(1220, casa.getGastoTotal());            //            = 1220
    }

}
