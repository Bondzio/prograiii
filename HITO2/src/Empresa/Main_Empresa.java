package Empresa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main_Empresa {
    public static void main(String[] args) {
//        Empleado Emp1 = new Empleado("Emp1", "CI1", 20);
//        Empleado Emp2 = new Empleado("Emp2", "CI2", 20);
//        Emp1.Imprimir();
//        Emp2.Imprimir();
//        Empleado[] empleadosRRHH = new Empleado[1];
//        empleadosRRHH[0] = Emp1;
//        empleadosRRHH[1] = Emp2;
//
//        Area area1 = new Area("RRHH", empleadosRRHH);

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados");
        int Num = leer.nextInt();
        String nombre = leer.nextLine();
        Empleado[] empleadosRRHH = new Empleado[2];
        for(int i=0; i<Num;i++){
            System.out.println("Ingrese el nombre del empleado");
            String Nombre = leer.next();
            System.out.println("Ingrese el CI del empleado");
            String ci = leer.next();
            System.out.println("Ingrese la edad del empleados");
            int Edad = leer.nextInt();
            Empleado empleado1 = new Empleado(Nombre,ci,Edad);
            empleadosRRHH[i] = empleado1;
        }

        Area area1 = new Area("RRHH",empleadosRRHH);
        Area[] areadeempresa = new Area[1];
        areadeempresa[0] = area1;
        empresa empresa1 = new empresa(" unifranz",areadeempresa);
        empresa1.IMPRIMIR();
        System.out.println();
    }
}
