package com.CVPaciente.DefensaH3.SERVICE;

import com.CVPaciente.DefensaH3.MODEL.DCVModel;
import java.util.List;
public interface DCVServiceInterface {
    public DCVModel save(DCVModel pModel);
    public DCVModel update(DCVModel pModel, Integer IDCoronaV);
    public Integer delete(Integer IDCoronaV);
    public List<DCVModel> GetAllPaciente();
    public DCVModel GetPacienteByIDCoronaV(Integer IDCoronaV);
}