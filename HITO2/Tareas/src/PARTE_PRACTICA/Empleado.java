package PARTE_PRACTICA;

public class Empleado implements LeerInterface{
    String PNombre, PApellido, ExtCI;
    int CINumero;
    public Empleado(){
    }
    public void Leer() {
        System.out.println("Ingrese primer Nombre");
        PNombre = LEER.next();
        System.out.println("Ingrese primer apellido");
        PApellido = LEER.next();
        System.out.println("Ingrese  CI de empleado");
        CINumero = LEER.nextInt();
        System.out.println("Ingrese extencionCI de empleado");
        ExtCI = LEER.next();
    }
    public void Mostrar(){
        System.out.println("Nombre: "+ PNombre);
        System.out.println("Apellido: "+ PApellido);
        System.out.println("CI: "+ CINumero);
        System.out.println("CIExtenc: "+ExtCI);

    }
}
