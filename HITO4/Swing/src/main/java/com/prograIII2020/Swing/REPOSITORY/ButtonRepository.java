package com.prograIII2020.Swing.REPOSITORY;

import com.prograIII2020.Swing.MODEL.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonRepository extends JpaRepository<ButtonModel, Integer> {
    @Query(value = "SELECT * FROM button ORDER BY random() LIMIT 1", nativeQuery = true)
    public ButtonModel getTitleButton();
}
