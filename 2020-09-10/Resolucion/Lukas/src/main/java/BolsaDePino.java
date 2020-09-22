public class BolsaDePino implements Combustible{
    private int kilogramos;
    private int COEFICIENTE_CALORICO = 3;
    private int PRECIO_POR_KILO = 2;

    public BolsaDePino(int kilogramos){
        this.kilogramos = kilogramos;
    }

    public int calcularCostoPara(int metrosCuadrados){
        return PRECIO_POR_KILO*kilogramos + metrosCuadrados*kilogramos/COEFICIENTE_CALORICO;
    }
    public int peso(){
        return kilogramos;
    }
}
