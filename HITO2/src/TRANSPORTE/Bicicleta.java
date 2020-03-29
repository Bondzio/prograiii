package TRANSPORTE;

public class Bicicleta implements Vehiculo{
    private int NroRuedas;
    private String Color;

    public void NroRuedas(){
        System.out.printf("Nro de ruedas de la bicicleta es: %d\n", this.getNroRuedas());
    }
    public void Color(){
        System.out.printf("Color de la bicicleta es: %s\n", this.getColor());
    }

    public void setNroRuedas(int nroRuedas) {
        this.NroRuedas = nroRuedas;
    }

    public int getNroRuedas() {
        return this.NroRuedas;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getColor() {
        return this.Color;
    }
}
