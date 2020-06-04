package com.prograIII2020.Swing.SERVICE;

import com.prograIII2020.Swing.MODEL.ButtonModel;

import java.util.List;

public interface ButtonServiceInterface {
    public void saveData();
    public String getRow();
    public List<ButtonModel> getAllTitleButton();
}
