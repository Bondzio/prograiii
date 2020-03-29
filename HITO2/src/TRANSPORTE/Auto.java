package TRANSPORTE;

public class Auto implements Vehiculo{
    private int NroRuedas;
    private String Color;

    public void NroRuedas(){
        System.out.printf("Nro de ruedas del auto es: %d\n", this.getNroRuedas());
    }

    public void Color(){
        System.out.printf("Color del auto es: %s\n", this.getColor());
    }

    public int getNroRuedas() {
        return this.NroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.NroRuedas = nroRuedas;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
}
