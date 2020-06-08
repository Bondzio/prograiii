package com.RCS.DictionaryH4EX.SERVICE;

import com.RCS.DictionaryH4EX.MODEL.AlphabetModel;
import com.RCS.DictionaryH4EX.MODEL.DictionaryModel;
import com.RCS.DictionaryH4EX.REPOSITORY.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DictionaryService implements DictionaryServiceInterface {
    private static final String Dictionary_English = "MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY";
    private static final String Dictionary_Portugues = "SEGUNDA-FEIRA,TERCA-FEIRA,QUARTA-FEIRA,QUINTA-FEIRA,SEXTA-FEIRA,SABADO,DOMINGO";
    private static final String Dictionary_Word = "LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO";

    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public void saveDataD() {
        if (dictionaryRepository.count() == 0) {
            dictionaryRepository.save(new DictionaryModel(Dictionary_English, "englishselected"));
            dictionaryRepository.save(new DictionaryModel(Dictionary_Portugues, "portuguesselected"));
            dictionaryRepository.save(new DictionaryModel(Dictionary_Word, "wordselected"));
        }

    }


    @Override
    public List<DictionaryModel> getAllEnglis() {
        return (List<DictionaryModel>) dictionaryRepository.getEnglishTranslate(Dictionary_English);
    }

    @Override
    public List<DictionaryModel> getAllPortugues() {
        return (List<DictionaryModel>) dictionaryRepository.getPortuTranslate(Dictionary_Portugues);
    }

    @Override
    public List<DictionaryModel> getAllWord() {
        return (List<DictionaryModel>) dictionaryRepository.getWordTranslate(Dictionary_Word);
    }
}
