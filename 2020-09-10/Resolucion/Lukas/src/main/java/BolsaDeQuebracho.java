public class BolsaDeQuebracho implements Combustible{
    private int kilogramos;
    private final int PUREZA = 2;
    private int PRECIO_POR_KILO = 4;

    public BolsaDeQuebracho(int kilogramos){
        this.kilogramos = kilogramos;
    }

    public int calcularCostoPara(int metrosCuadrados){
        return PRECIO_POR_KILO*kilogramos + metrosCuadrados*kilogramos*PUREZA;
    }

    public int peso(){
        return kilogramos;
    }
}
