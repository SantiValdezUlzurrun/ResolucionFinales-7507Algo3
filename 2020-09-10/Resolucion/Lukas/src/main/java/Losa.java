public class Losa implements Consumista {

    private int precioKw;
    private int metros;

    public Losa(int precioKw, int metros){
        if(precioKw < 0 || metros < 0){
            throw new ValorInvalidoException();
        }
        this.precioKw = precioKw;
        this.metros = metros;
    }

    public int consumo(){
        return precioKw * metros * metros;
    }
}