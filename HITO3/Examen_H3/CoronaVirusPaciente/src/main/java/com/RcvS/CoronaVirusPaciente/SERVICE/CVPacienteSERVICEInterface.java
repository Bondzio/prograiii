package com.RcvS.CoronaVirusPaciente.SERVICE;

import com.RcvS.CoronaVirusPaciente.MODEL.CVPacienteModel;
import java.util.List;
public interface CVPacienteSERVICEInterface {
    public CVPacienteModel save(CVPacienteModel pModel);
    public CVPacienteModel update(CVPacienteModel pModel, Integer id_corona_virus);
    public Integer delete(Integer id_corona_virus);
    public List<CVPacienteModel> getAllPacientes();
    public CVPacienteModel getPacienteByid_corona_virus(Integer id_corona_virus);
}
