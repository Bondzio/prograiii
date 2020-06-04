package com.prograIII2020.Swing.MODEL;

import javax.persistence.*;

@Entity
@Table (name = "Button")
public class ButtonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name = "Title", length = 50, nullable = false)
    private String TitleButton;

    public ButtonModel(){}

    public ButtonModel(String title){
        this.TitleButton = title;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer id) {
        ID = id;
    }

    public String getTitleButton() {
        return TitleButton;
    }

    public void setTitleButton(String titleButton) {
        this.TitleButton = titleButton;
    }
}
