package PARTE_PRACTICA;

public class Supervisor extends Empleado{
        int SUELD;
        int ANTIG;
        public Supervisor(){
        }
        public void Leer(){
            Empleado.Leer();
            System.out.println("Ingrese el sueldo del Supervisor");
            SUELD = LEER.nextInt();
            System.out.println("Ingrese la antiguedad del Supervisor");
            ANTIG = LEER.nextInt();
        }
        public void Mostrar(){
            Empleado.Mostrar();
            System.out.printf("Sueldo: %s  Antiguedad: %s",SUELD,ANTIG);
        }
}
