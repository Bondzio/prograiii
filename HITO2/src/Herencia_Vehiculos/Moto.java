package Herencia_Vehiculos;

public class Moto extends Vehiculo{
    public Moto(int Velo, String Placa, int nrRuedas, int nrAsientos){
        super(Placa,nrRuedas,nrAsientos);
    }
    public void ImpMt(){
        System.out.println(getPlaca());
    }
}
