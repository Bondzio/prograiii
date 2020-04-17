package com.CoronaVirus.CoronaVirus;

import com.CoronaVirus.CoronaVirus.MODEL.CoronaVirusModel;
import com.CoronaVirus.CoronaVirus.SERVICE.CoronaVirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoronaVirusApplication implements CommandLineRunner{
	@Autowired
	private CoronaVirusService CoronaService[];


	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CoronaService = new CoronaVirusService[3];
		for (int i = 0; i < 3; i++){
			CoronaVirusService Cs = new CoronaVirusService();
			Cs.LEER();
			CoronaService[i] = Cs;
		}

		for (int i = 0; i < CoronaService.length; i++){
			CoronaService[i].MOSTRAR();
		}

		int Mayor = 0;
		int POS = 0;
		Mayor = CoronaService[0].CasosConfirmados;
		for (int i = 1; i < CoronaService.length; i++){
			if(CoronaService[i].CasosConfirmados > Mayor){
				Mayor = CoronaService[i].CasosConfirmados;
				POS = i;
			}
		}
		System.out.println("EL DEPARTAMENTO QUE TIENE MAS CASOS ES: " + CoronaService[POS].NombreDepartamento + " CON '" + Mayor + "' CASOS CONFIRMADOS");
	}
}
