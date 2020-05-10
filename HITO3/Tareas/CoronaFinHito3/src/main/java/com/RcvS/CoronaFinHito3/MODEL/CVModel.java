package com.RcvS.CoronaFinHito3.MODEL;

import javax.persistence.*;

@Entity
@Table(name = "CoronaVirus")
public class CVModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdCV;
    @Column(name = "NombreD", length = 50, nullable = false)
    private String NombreD;
    @Column(name = "CasosContagiados")
    private Integer CasosContagiados;
    @Column(name = "CasosSospechosos")
    private Integer CasosSospechosos;
    @Column(name = "CasosRecuperados")
    private Integer CasosRecuperados;

    public Integer getIdCV() {
        return IdCV;
    }

    public void setIdCV(Integer idCV) {
        this.IdCV = idCV;
    }

    public String getNombreD() {
        return NombreD;
    }

    public void setNombreD(String nombreD) {
        this.NombreD = nombreD;
    }

    public Integer getCasosContagiados() {
        return CasosContagiados;
    }

    public void setCasosContagiados(Integer casosContagiados) {
        this.CasosContagiados = casosContagiados;
    }

    public Integer getCasosSospechosos() {
        return CasosSospechosos;
    }

    public void setCasosSospechosos(Integer casosSospechosos) {
        this.CasosSospechosos = casosSospechosos;
    }

    public Integer getCasosRecuperados() {
        return CasosRecuperados;
    }

    public void setCasosRecuperados(Integer casosRecuperados) {
        this.CasosRecuperados = casosRecuperados;
    }
}
