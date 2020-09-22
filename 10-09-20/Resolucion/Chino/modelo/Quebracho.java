package modelo;

public class Quebracho implements Madera{
    private static final int precio = 4;
    private static final int pureza = 2;

    public int calcularCosto(int metrosCuadrados, int costo){
        return metrosCuadrados * (costo/precio) * pureza;
    }

    public int calcularPeso(int costo){
        return costo/precio;
    }
}
