package com.RCS.DictionaryH4EX.SERVICE;

import com.RCS.DictionaryH4EX.MODEL.AlphabetModel;
import com.RCS.DictionaryH4EX.MODEL.DictionaryModel;

import java.util.List;

public interface DictionaryServiceInterface {
    public void saveDataD();
    public List<DictionaryModel> getAllEnglis();
    public List<DictionaryModel> getAllPortugues();
    public List<DictionaryModel> getAllWord();
}
