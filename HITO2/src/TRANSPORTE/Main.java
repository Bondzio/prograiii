package TRANSPORTE;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setColor("BLACK");
        auto.setNroRuedas(4);
        auto.Color();
        auto.NroRuedas();

        Bicicleta bici = new Bicicleta();
        bici.setColor("WHITE");
        bici.setNroRuedas(2);
        bici.Color();
        bici.NroRuedas();
    }
}
