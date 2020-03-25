package Herencia_Vehiculos;

public class Vehiculo {
    public String Placa;
    public int nroRuedas;
    public int nroAsientos;

    public Vehiculo(String placa, int Nruedas,  int NAsientos){
        this.Placa = placa;
        this.nroRuedas = Nruedas;
        this.nroAsientos = NAsientos;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getPlaca() {
        return this.Placa;
    }
}
