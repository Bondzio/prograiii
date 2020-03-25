package Herencia_Vehiculos;

public class Micro extends Vehiculo{
    private int Velo;

    public Micro(int Velo, String Placa, int nrRuedas, int nrAsientos){
        super(Placa,nrRuedas,nrAsientos);
    }
    public void ImpMic(){
        System.out.println(getPlaca());
    }
}
