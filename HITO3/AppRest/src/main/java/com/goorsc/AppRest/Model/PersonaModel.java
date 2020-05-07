package com.goorsc.AppRest.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "fechanv")
    private Date fechanv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechanv() {
        return fechanv;
    }

    public void setFechanv(Date fechanv) {
        this.fechanv = fechanv;
    }
}
