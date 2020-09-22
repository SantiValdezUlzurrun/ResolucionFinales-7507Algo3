public class CercoElectrico implements Consumista {
    private int metros;
    private int precioKw;

    public CercoElectrico(int precioKw, int metros){
        if(precioKw < 0 || metros < 0){
            throw new ValorInvalidoException();
        }
        this.precioKw = precioKw;
        this.metros = metros;
    }

    public int consumo(){
        return metros * precioKw;
    }
}
