package com.RCVS.TareaFinH4.SERVICE;

import com.RCVS.TareaFinH4.MODEL.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
    public void SaveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}
