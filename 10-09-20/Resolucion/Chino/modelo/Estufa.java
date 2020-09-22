package modelo;

public class Estufa implements ComponenteDomestico{
    public int precioKw;
    public int calorias;
    public int ambientes;

    public Estufa(int precioKw, int calorias, int ambientes){
        this.precioKw = precioKw;
        this.calorias = calorias;
        this.ambientes = ambientes;
    }

    public int getConsumo(){
        return precioKw * calorias * ambientes;
    }
}
