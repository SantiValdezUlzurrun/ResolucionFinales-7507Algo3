import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        Efecto efecto = new AgregarNumeroAlFinal(5);
        String cadena = efecto.aplicar("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {

        Efecto efecto = new AgregarNumeroAlFinal(8);
        String cadena = efecto.aplicar("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {

        Efecto efecto = new DarVuelta(new PrimeraMayuscula());
        String cadena = efecto.aplicar("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        Efecto efecto = new PrimeraMayuscula();
        String cadena = efecto.aplicar("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        Efecto efecto = new PrimeraMayuscula(new AgregarNumeroAlFinal(8));
        String cadena = efecto.aplicar("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        Efecto efecto = new AgregarNumeroAlFinal(5);

        org.junit.Assert.assertThrows(CadenaVaciaAlAplicarEfectoException.class, ()->{
            String cadena = efecto.aplicar("");
        });
    }

    /*
    Efecto 1:
    Agregar un numero 3 al final de la cadena
    Pasar la primera letra de la cadena a minuscula
    Ejemplo: "ALGO" -> "aLGO3"
    */
    @Test
    public void test3AlFinalPrimeraLetraMuinuscula() {
        Efecto efecto = new AgregarNumeroAlFinal(new PrimeraMinuscula(),3);
        String cadena = efecto.aplicar("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }

    /*
    Efecto 2:
    Dar vuelta la cadena
    Pasar la primera letra de la cadena a minuscula
    Agregar un numero 4 al final de la cadena
    Ejemplo: "ALGO" -> "oGLA4"
    */
    @Test
    public void testDarVueltaPrimeraLetraAMinusculaAgregar4AlFinal() {
        Efecto efecto = new DarVuelta(new PrimeraMinuscula(new AgregarNumeroAlFinal(4)));
        String cadena = efecto.aplicar("ALGO");
        Assert.assertEquals("oGLA4", cadena);
    }
}
