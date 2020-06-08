package com.RCS.DictionaryH4EX.SERVICE;

import com.RCS.DictionaryH4EX.MODEL.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}
