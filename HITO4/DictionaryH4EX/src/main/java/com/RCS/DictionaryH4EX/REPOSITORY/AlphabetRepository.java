package com.RCS.DictionaryH4EX.REPOSITORY;

import com.RCS.DictionaryH4EX.MODEL.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {
    @Query(value="SELECT * FROM alphabet_di WHERE TYPER='first';", nativeQuery=true)
    public List<AlphabetModel> getFirstRow();

    @Query(value="SELECT * FROM alphabet_di WHERE TYPER='second';", nativeQuery=true)
    public List<AlphabetModel> getSecondRow();

    @Query(value="SELECT * FROM alphabet_di WHERE TYPER='three';", nativeQuery=true)
    public List<AlphabetModel> getThreeRow();
}