public class Estufa implements Consumista {
    private int cantidadDeAmbientes;
    private int precioKw;
    private int calorias;

    public Estufa(int cantidadAmbientes, int precioKw, int calorias){
        if(cantidadAmbientes < 0 || precioKw < 0 || calorias < 0){
            throw new ValorInvalidoException();
        }
        this.cantidadDeAmbientes = cantidadAmbientes;
        this.precioKw = precioKw;
        this.calorias = calorias;
    }

    public int consumo(){
        return cantidadDeAmbientes * precioKw * calorias;
    }
}