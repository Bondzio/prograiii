package com.prograIII2020.Swing.SERVICE;

import com.prograIII2020.Swing.MODEL.ButtonModel;
import com.prograIII2020.Swing.REPOSITORY.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ButtonService implements ButtonServiceInterface{
    private static final  String TTLE_BUTONS = "SAVE;DELETE;CANCEL;LOGIN;LOGOUT;UPDATE";
    @Autowired
    private ButtonRepository buttonRepository;

    @Override
    public void saveData() {
        if (buttonRepository.count() == 0){
            String[] titleButtons = TTLE_BUTONS.split(";");

            for (String titleButton : titleButtons){
                buttonRepository.save(new ButtonModel(titleButton));
            }
        }
    }

    @Override
    public String getRow() {
        ButtonModel bModel = buttonRepository.getTitleButton();
        return bModel.getTitleButton();
    }

    @Override
    public List<ButtonModel> getAllTitleButton() {
//        List<ButtonModel> allTitles = new ArrayList<ButtonModel>();
//        buttonRepository.findAll().forEach(allTitles::add);
//        return allTitles;
        return new ArrayList<ButtonModel>(buttonRepository.findAll());
    }
}
