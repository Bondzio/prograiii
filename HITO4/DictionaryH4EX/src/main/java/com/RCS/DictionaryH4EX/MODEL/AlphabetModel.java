package com.RCS.DictionaryH4EX.MODEL;

import javax.persistence.*;

@Entity
@Table (name = "AlphabetDi")
public class AlphabetModel {
    //    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "LETTER", length = 200, nullable = false)
    private String LETTER;

    @Column(name = "TYPER", length = 10, nullable = false)
    private String TYPER;

    public AlphabetModel() {

    }

    public AlphabetModel(String letter, String typer) {
        this.LETTER = letter;
        this.TYPER = typer;
    }

    public String getTypeR() {
        return TYPER;
    }

    public void setTypeR(String typer) {
        this.TYPER = typer;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLetter() {
        return LETTER;
    }

    public void setLetter(String letter) {
        this.LETTER = letter;
    }
}
