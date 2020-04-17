package com.CoronaVirus.CoronaVirus.SERVICE;

import org.springframework.stereotype.Service;

@Service
public class CoronaVirusService implements InterfaceCoronaVirusService{
    public String NombreDepartamento;
    public int CasosConfirmados;
    public int CasosSospechosos;

//    @Autowired
//    private CoronaVirusModel CoronaM;
    @Override
    public void LEER() {
        System.out.println("Nombre del Departamento: ");
        this.NombreDepartamento = L.next();
        System.out.println("Casos Confirmados: ");
        this.CasosConfirmados = L.nextInt();
        System.out.println("Casos Sospechosos: ");
        this.CasosSospechosos = L.nextInt();
    }

    @Override
    public void MOSTRAR() {
        System.out.printf("NombreDepartamento: %s\n CasosConfirmados: %d\n CasosSospechosos: %d\n",this.NombreDepartamento,this.CasosConfirmados,this.CasosSospechosos);
    }
}
