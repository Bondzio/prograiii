package com.goorsc.AppRest.repo;
import com.goorsc.AppRest.Model.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<PersonaModel, Integer> {
}
