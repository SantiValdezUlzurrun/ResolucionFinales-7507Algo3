import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        Efecto efecto = new AgregarSufijoAlFinal("5");
        String cadena = efecto.aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        Efecto efecto = new AgregarSufijoAlFinal("8");
        String cadena = efecto.aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        List<Efecto> efectos = Arrays.asList(new DarVuelta(), new PrimeraMayuscula());
        Efecto efectoMultiple = new EfectoMultiple(efectos);

        String cadena = efectoMultiple.aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        Efecto efecto = new PrimeraMayuscula();
        String cadena = efecto.aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        List<Efecto> efectos = Arrays.asList(new PrimeraMayuscula(), new AgregarSufijoAlFinal("8"));
        Efecto efectoMultiple = new EfectoMultiple(efectos);

        String cadena = efectoMultiple.aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        Assert.assertThrows(StringInvalidoException.class, ()->{

            Efecto efecto = new AgregarSufijoAlFinal("5");
            String cadena = efecto.aplicarA("");

        });
    }

    @Test
    public void testPrimeraMinuscula() {
        Efecto efecto = new PrimeroMinuscula();
        String cadena = efecto.aplicarA("ALGO");
        Assert.assertEquals("aLGO", cadena);
    }

    @Test
    public void testPrimeraMinusculaYAgregoSufijo() {

        List<Efecto> efectos = Arrays.asList(new PrimeroMinuscula(), new AgregarSufijoAlFinal("3"));
        Efecto efectoMultiple = new EfectoMultiple(efectos);
        String cadena = efectoMultiple.aplicarA("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }

    @Test
    public void testDarVueltaPrimeraMinusculaYAgregoSufijo() {

        List<Efecto> efectos = Arrays.asList(new DarVuelta(),new PrimeroMinuscula(), new AgregarSufijoAlFinal("3"));
        Efecto efectoMultiple = new EfectoMultiple(efectos);
        String cadena = efectoMultiple.aplicarA("ALGO");
        Assert.assertEquals("oGLA3", cadena);
    }

}
