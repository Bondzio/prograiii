package Herencia_Vehiculos;

public class Trufi extends Vehiculo{
    private int VElocidad;

    public Trufi(int VElocidad, String Placa, int nrRuedas, int nrAsientos){
        super(Placa,nrRuedas,nrAsientos);
    }
    public void ImpTruf(){
        System.out.println(getPlaca());
    }
}
