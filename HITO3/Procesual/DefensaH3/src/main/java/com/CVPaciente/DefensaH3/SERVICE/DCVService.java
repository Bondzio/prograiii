package com.CVPaciente.DefensaH3.SERVICE;

import com.CVPaciente.DefensaH3.MODEL.DCVModel;
import com.CVPaciente.DefensaH3.REPO.DCVRepo;
//import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DCVService implements DCVServiceInterface {

    @Autowired
    private DCVRepo dcvRepo;

    @Override
    public DCVModel save(DCVModel pModel) {
        if (pModel.getEdadPaciente()>20){
            pModel.categoria = "Adulto";
        } else if (pModel.getEdadPaciente()<20 && pModel.getEdadPaciente()>10){
            pModel.categoria = "Adolescente";
        } else if (pModel.getEdadPaciente()<10){
            pModel.categoria = "Niño";
        }

        pModel.fullname = pModel.nombrePaciente+" " + " "+pModel.apellidosPaciente;
        return dcvRepo.save(pModel);
    }

    @Override
    public DCVModel update(DCVModel pModel, Integer IDCoronaV) {
        Optional<DCVModel> pacient = dcvRepo.findById(IDCoronaV);
        DCVModel pacienteUpdate = null;

        if  (pacient.isPresent()){
            pacienteUpdate = pacient.get();
            pacienteUpdate.setNombreDe(pModel.getNombreDe());
            pacienteUpdate.setNombrePaciente(pModel.getNombrePaciente());
            pacienteUpdate.setApellidosPaciente(pModel.getApellidosPaciente());
            pacienteUpdate.setEdadPaciente(pModel.getEdadPaciente());
            pacienteUpdate.setCategoria(pModel.getCategoria());
            pacienteUpdate.setFullname(pModel.getFullname());
            pacienteUpdate.setCasosContagiados(pModel.getCasosContagiados());
            pacienteUpdate.setCasosSospechosos(pModel.getCasosSospechosos());
            pacienteUpdate.setCasosRecuperados(pModel.getCasosRecuperados());
            dcvRepo.save(pacienteUpdate);
        }
        return pacienteUpdate;
    }

    @Override
    public Integer delete(Integer IDCoronaV) {
        dcvRepo.deleteAll();
        return 1;
    }

    @Override
    public List<DCVModel> GetAllPaciente() {
        List<DCVModel> pacients = new ArrayList<DCVModel>();
        dcvRepo.findAll().forEach(pacients::add);
        return pacients;
    }

    @Override
    public DCVModel GetPacienteByIDCoronaV(Integer IDCoronaV) {
        Optional<DCVModel> pacient = dcvRepo.findById(IDCoronaV);
        DCVModel pModel = null;

        if (pacient.isPresent()){
            pModel = pacient.get();
        }
        return pModel;
    }
}
