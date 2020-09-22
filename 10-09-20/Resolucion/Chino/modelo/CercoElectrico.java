package modelo;

public class CercoElectrico implements ComponenteDomestico{
    private int precioKw;
    private int metros;

    public CercoElectrico(int precioKw, int metros){
        this.precioKw= precioKw;
        this.metros = metros;
    }
    public int getConsumo(){
        return precioKw * metros;
    }
}
