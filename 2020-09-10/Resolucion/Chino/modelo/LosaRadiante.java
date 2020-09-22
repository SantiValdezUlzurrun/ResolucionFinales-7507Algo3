package modelo;

public class LosaRadiante implements ComponenteDomestico{
    private int precioKw;
    private int metros;

    public LosaRadiante(int precioKw, int metros){
        this.precioKw= precioKw;
        this.metros = metros;
    }
    public int getConsumo(){
        return precioKw * metros * metros;
    }
}
