package com.spring.demo.Services;

import com.spring.demo.Model.ModelPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePersona implements InterfaceServicePersona{
    @Autowired
    private ModelPersona mPersona;
    @Override
    public void Insertar(String nombre) {
        mPersona.Insertar(nombre);
    }
}
