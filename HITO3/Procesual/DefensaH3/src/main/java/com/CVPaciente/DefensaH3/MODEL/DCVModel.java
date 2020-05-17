package com.CVPaciente.DefensaH3.MODEL;

import javax.persistence.*;

@Entity
@Table(name = "coronaVpacienteDefensa")
public class DCVModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IDCoronaV;
    @Column(name = "nombreDe", length = 50, nullable = false)
    private String nombreDe;
    @Column(name = "nombrePaciente", length = 50, nullable = false)
    public String nombrePaciente;
    @Column(name = "apellidosPaciente", length = 50, nullable = false)
    public String apellidosPaciente;
    @Column(name = "edadPaciente")
    public Integer edadPaciente;
    @Column(name = "categoria", length = 50, nullable = false)
    public String categoria;
    @Column(name = "fullname",length = 100, nullable = false)
    public String fullname;
    @Column(name = "casosContagiados")
    private Integer casosContagiados;
    @Column(name = "casosSospechosos")
    private Integer casosSospechosos;
    @Column(name = "casosRecuperados")
    private Integer casosRecuperados;

    public Integer getIDCoronaV() {
        return IDCoronaV;
    }

    public void setIDCoronaV(Integer IDCoronaV) {
        this.IDCoronaV = IDCoronaV;
    }

    public String getNombreDe() {
        return nombreDe;
    }

    public void setNombreDe(String nombreDe) {
        this.nombreDe = nombreDe;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public Integer getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(Integer edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getCasosContagiados() {
        return casosContagiados;
    }

    public void setCasosContagiados(Integer casosContagiados) {
        this.casosContagiados = casosContagiados;
    }

    public Integer getCasosSospechosos() {
        return casosSospechosos;
    }

    public void setCasosSospechosos(Integer casosSospechosos) {
        this.casosSospechosos = casosSospechosos;
    }

    public Integer getCasosRecuperados() {
        return casosRecuperados;
    }

    public void setCasosRecuperados(Integer casosRecuperados) {
        this.casosRecuperados = casosRecuperados;
    }
}
