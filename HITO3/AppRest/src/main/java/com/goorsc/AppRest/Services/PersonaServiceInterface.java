package com.goorsc.AppRest.Services;

import com.goorsc.AppRest.Model.PersonaModel;
import java.util.List;

public interface PersonaServiceInterface {
    public PersonaModel save(PersonaModel pModel);
    public PersonaModel update(PersonaModel pModel, Integer id);
    public Integer delete(Integer id);
    public List<PersonaModel> getAllPersons();
    public PersonaModel getPersonByIdPer(Integer id);
}
