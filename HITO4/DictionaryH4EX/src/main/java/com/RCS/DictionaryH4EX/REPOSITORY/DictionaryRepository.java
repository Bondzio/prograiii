package com.RCS.DictionaryH4EX.REPOSITORY;

import com.RCS.DictionaryH4EX.MODEL.AlphabetModel;
import com.RCS.DictionaryH4EX.MODEL.DictionaryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryRepository extends JpaRepository<DictionaryModel, Integer> {
    @Query(value="SELECT * FROM dictionary WHERE word = :englishselected", nativeQuery=true)
    public DictionaryModel getEnglishTranslate(@Param("englishselected") String englishselected);

    @Query(value="SELECT * FROM dictionary WHERE word = :portuguesselected", nativeQuery=true)
    public DictionaryModel getPortuTranslate(@Param("portuguesselected") String portuguesselected);

    @Query(value="SELECT * FROM dictionary WHERE word = :wordselected", nativeQuery=true)
    public DictionaryModel getWordTranslate(@Param("wordselected") String wordselected);
}
