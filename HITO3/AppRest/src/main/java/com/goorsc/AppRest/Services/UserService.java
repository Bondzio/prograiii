package com.goorsc.AppRest.Services;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{
    @Override
    public String GetName(String Name) {
        return "Miprimer servicio REST by: " + Name;
    }
}
