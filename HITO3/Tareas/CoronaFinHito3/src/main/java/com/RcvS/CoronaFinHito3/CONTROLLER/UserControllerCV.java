package com.RcvS.CoronaFinHito3.CONTROLLER;

import com.RcvS.CoronaFinHito3.MODEL.CVModel;
import com.RcvS.CoronaFinHito3.SERVICE.CVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/")
public class UserControllerCV {
    @Autowired
    private CVService cvService;

    @PostMapping("/coronaVirus")
    public ResponseEntity save(@RequestBody CVModel cvModel){
        try {
            return  new ResponseEntity(cvService.save(cvModel), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/coronaVirus/{IdCV}")
    public ResponseEntity<CVModel> update(@PathVariable("IdCV") Integer IdCV, @RequestBody CVModel cvModel){
        try {
            CVModel cUpdat = cvService.update(cvModel, IdCV);
            if (cUpdat != null){
                return new ResponseEntity<>(cUpdat, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/coronaVirus/getOne/{IdCV}")
    public ResponseEntity<CVModel> GetCVByIdCV(@PathVariable("IdCV") Integer IdCV){
        try {
            CVModel pModel = cvService.GetCVByIdCV(IdCV);
            if (pModel != null){
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/coronaVirus/")
    public ResponseEntity<List<CVModel>> GetAllCV(){
        try {
            List<CVModel> Coronv = cvService.GetAllCV();
            if (Coronv.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(Coronv, HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/coronaVirus/deleteCV/{IdCV}")
    public ResponseEntity<String> delete(@PathVariable("IdCV") Integer IdCV){
        try {
            cvService.delete(IdCV);
            return new ResponseEntity<>("DataBase sccesfully deleted", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
