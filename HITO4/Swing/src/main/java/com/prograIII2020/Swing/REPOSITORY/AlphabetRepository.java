package com.prograIII2020.Swing.REPOSITORY;

import com.prograIII2020.Swing.MODEL.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {
    @Query(value="SELECT * FROM alphabet WHERE typer='first';", nativeQuery=true)
    public List<AlphabetModel> getFirstRow();

    @Query(value="SELECT * FROM alphabet WHERE typer='second';", nativeQuery=true)
    public List<AlphabetModel> getSecondRow();

    @Query(value="SELECT * FROM alphabet WHERE typer='three';", nativeQuery=true)
    public List<AlphabetModel> getThreeRow();
}
