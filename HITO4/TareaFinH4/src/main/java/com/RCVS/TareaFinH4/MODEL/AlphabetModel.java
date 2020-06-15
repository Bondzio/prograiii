package com.RCVS.TareaFinH4.MODEL;


import javax.persistence.*;

@Entity
@Table (name = "ALPHABETH4")
public class AlphabetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name = "letter", length = 200, nullable = false)
    private String LETTER;

    @Column(name = "typeR", length = 10, nullable = false)
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
        return ID;
    }

    public void setId(Integer id) {
        ID = id;
    }

    public String getLetter() {
        return LETTER;
    }

    public void setLetter(String letter) {
        this.LETTER = letter;
    }
}
