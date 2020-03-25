package Herencia_Vehiculos;

public class Main {
    public static void main(String[] args) {
        Trufi T = new Trufi(180 ,"1562 XD",2,8 );
        Micro M = new Micro(100,"3542XDP", 6,20);
        Moto Mt = new Moto(160,"4565DFG",2,0);
        T.ImpTruf();
        M.ImpMic();
        Mt.ImpMt();
    }
}
