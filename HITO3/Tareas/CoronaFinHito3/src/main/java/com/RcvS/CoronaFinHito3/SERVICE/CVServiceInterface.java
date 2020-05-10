package com.RcvS.CoronaFinHito3.SERVICE;

import com.RcvS.CoronaFinHito3.MODEL.CVModel;

import java.util.List;

public interface CVServiceInterface {
    public CVModel save(CVModel pModel);
    public CVModel update(CVModel pModel, Integer IdCV);
    public Integer delete(Integer IdCV);
    public List<CVModel> GetAllCV();
    public CVModel GetCVByIdCV(Integer IdCV);
}
