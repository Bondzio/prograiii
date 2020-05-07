package com.RcvS.CoronaVirusPaciente.CONTROLLER;

import com.RcvS.CoronaVirusPaciente.CoronaVirusPacienteApplication;
import com.RcvS.CoronaVirusPaciente.MODEL.CVPacienteModel;
import com.RcvS.CoronaVirusPaciente.SERVICE.CVPacienteSERVICE;
//import com.sun.org.apache.bcel.internal.ExceptionConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserController {

    @Autowired
    private CVPacienteSERVICE pacienteSERVICE;

    @PostMapping("/coronaVirusPaciente")
    public ResponseEntity save(@RequestBody CVPacienteModel cvPacienteModel){
        try {
            return  new ResponseEntity(pacienteSERVICE.save(cvPacienteModel), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
    }





    @PutMapping("/coronaVirusPaciente/{id_corona_virus}")
    public ResponseEntity<CVPacienteModel> update(@PathVariable("id_corona_virus") Integer id_corona_virus, @RequestBody CVPacienteModel pacienteModel){
        try {
            CVPacienteModel pUdat = pacienteSERVICE.update(pacienteModel, id_corona_virus);
            if (pUdat != null){
                return new ResponseEntity<>(pUdat, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/coronaVirusPaciente/")
    public ResponseEntity<List<CVPacienteModel>> getAllPacientes(){
        try {
            List<CVPacienteModel> pacients = pacienteSERVICE.getAllPacientes();
            if (pacients.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(pacients, HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/coronaVirusPaciente/getOne/{id_corona_virus}")
    public ResponseEntity<CVPacienteModel> getPacienteByid_corona_virus(@PathVariable("id_corona_virus") Integer id_corona_virus){
        try {
            CVPacienteModel pModel = pacienteSERVICE.getPacienteByid_corona_virus(id_corona_virus);
            if (pModel != null){
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/paciente/{id_corona_virus}")
    public ResponseEntity<String> delete(@PathVariable("id_corona_virus") Integer id_corona_virus){
        try {
            pacienteSERVICE.delete(id_corona_virus);
            return new ResponseEntity<>("DataBase sccesfully deleted", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
