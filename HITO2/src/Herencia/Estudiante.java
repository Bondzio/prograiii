package Herencia;

import javax.print.attribute.standard.MediaPrintableArea;

public class Estudiante extends Persona{
    private String Carrera;

    public Estudiante(String Carrera, String nombres, String ap, int Edad, String CI){
        super(nombres, ap,Edad, CI);
    }

    public void ImpEst(){
        System.out.println(getCI());
    }
}
