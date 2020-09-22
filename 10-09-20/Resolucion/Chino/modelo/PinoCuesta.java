package modelo;

public class PinoCuesta implements Madera{
    private static final int precio = 2;
    private static final int cofCalorico = 3;

    public int calcularCosto(int metrosCuadrados, int costo){
        return (metrosCuadrados * (costo/precio) )/cofCalorico;
    }

    public int calcularPeso(int costo){
        return costo/precio;
    }
}
