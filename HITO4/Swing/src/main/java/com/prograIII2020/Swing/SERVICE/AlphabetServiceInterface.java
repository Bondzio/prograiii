package com.prograIII2020.Swing.SERVICE;

import com.prograIII2020.Swing.MODEL.AlphabetModel;
import java.util.List;

public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}
