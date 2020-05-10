package com.RcvS.CoronaFinHito3.SERVICE;

import com.RcvS.CoronaFinHito3.MODEL.CVModel;
import com.RcvS.CoronaFinHito3.REPO.CVRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CVService implements CVServiceInterface{
    @Autowired
    private CVRepoInterface repoInterface;

    @Override
    public CVModel save(CVModel pModel) {
        return repoInterface.save(pModel);
    }

    @Override
    public CVModel update(CVModel cModel, Integer IdCV) {
        Optional<CVModel> corona = repoInterface.findById(IdCV);
        CVModel coronaUpdate = null;
        if (corona.isPresent()){
            coronaUpdate = corona.get();
            coronaUpdate.setNombreD(cModel.getNombreD());
            coronaUpdate.setCasosContagiados(cModel.getCasosContagiados());
            coronaUpdate.setCasosSospechosos(cModel.getCasosSospechosos());
            coronaUpdate.setCasosRecuperados(cModel.getCasosRecuperados());
            repoInterface.save(coronaUpdate);
        }
        return coronaUpdate;
    }

    @Override
    public Integer delete(Integer IdCV) {
        repoInterface.deleteById(IdCV);
        return 1;
    }

    @Override
    public List<CVModel> GetAllCV() {
        List<CVModel> coron = new ArrayList<CVModel>();
        repoInterface.findAll().forEach(coron::add);
        return coron;
    }

    @Override
    public CVModel GetCVByIdCV(Integer IdCV) {
        Optional<CVModel> Corona = repoInterface.findById(IdCV);
        CVModel CModel = null;
        if (Corona.isPresent()){
            CModel = Corona.get();
        }
        return CModel;
    }
}
