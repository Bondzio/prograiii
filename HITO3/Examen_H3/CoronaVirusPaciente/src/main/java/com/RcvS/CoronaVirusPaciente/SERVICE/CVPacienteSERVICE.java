package com.RcvS.CoronaVirusPaciente.SERVICE;

import com.RcvS.CoronaVirusPaciente.MODEL.CVPacienteModel;
import com.RcvS.CoronaVirusPaciente.REPO.CVPacienteRepo;
//import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CVPacienteSERVICE implements CVPacienteSERVICEInterface {

    @Autowired
    private CVPacienteRepo pacienteRepo;

    @Override
    public CVPacienteModel save(CVPacienteModel pModel) {
        if (pModel.getEdad_paciente()>20){
            pModel.categoria = "Adulto";
        } else if (pModel.getEdad_paciente()<20 && pModel.getEdad_paciente()>10){
            pModel.categoria = "Adolescente";
        } else if (pModel.getEdad_paciente()<10){
            pModel.categoria = "Niño";
        }

        pModel.fullname = pModel.nombre_paciente+" " + " "+pModel.apellidos_paciente;
        return pacienteRepo.save(pModel);
    }

    @Override
    public CVPacienteModel update(CVPacienteModel pModel, Integer id_corona_virus) {
        Optional<CVPacienteModel> pacient = pacienteRepo.findById(id_corona_virus);
        CVPacienteModel pacienteUpdate = null;

        if  (pacient.isPresent()){
            pacienteUpdate = pacient.get();
            pacienteUpdate.setNombre_dep(pModel.getNombre_dep());
            pacienteUpdate.setNombre_paciente(pModel.getNombre_paciente());
            pacienteUpdate.setApellidos_paciente(pModel.getApellidos_paciente());
            pacienteUpdate.setEdad_paciente(pModel.getEdad_paciente());
            pacienteUpdate.setCategoria(pModel.getCategoria());
            pacienteUpdate.setFullname(pModel.getFullname());
            pacienteUpdate.setCasos_contagiados(pModel.getCasos_contagiados());
            pacienteUpdate.setCasos_sospechosos(pModel.getCasos_sospechosos());
            pacienteUpdate.setCasos_recuperados(pModel.getCasos_recuperados());
            pacienteRepo.save(pacienteUpdate);
        }
        return pacienteUpdate;
    }

    @Override
    public Integer delete(Integer id_corona_virus) {
        pacienteRepo.deleteById(id_corona_virus);
        return 1;
    }

    @Override
    public List<CVPacienteModel> getAllPacientes() {
        List<CVPacienteModel> pacients = new ArrayList<CVPacienteModel>();
        pacienteRepo.findAll().forEach(pacients::add);
        return pacients;
    }

    @Override
    public CVPacienteModel getPacienteByid_corona_virus(Integer id_corona_virus) {
        Optional<CVPacienteModel> pacient = pacienteRepo.findById(id_corona_virus);
        CVPacienteModel pModel = null;

        if (pacient.isPresent()){
            pModel = pacient.get();
        }
        return pModel;
    }
}
