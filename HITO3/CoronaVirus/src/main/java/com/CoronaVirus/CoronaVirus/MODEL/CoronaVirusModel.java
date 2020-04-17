package com.CoronaVirus.CoronaVirus.MODEL;


import org.springframework.stereotype.Repository;

@Repository
public class CoronaVirusModel implements InterfaceCoronaVirusModel{

    @Override
    public void LEER(String D, int CasC, int casS) {
        System.out.println("DATOS INSERTADOS " + D + CasC + casS);
    }

    @Override
    public void MOSTRAR() {
        System.out.println("MOSTRAR");
    }
}
