package com.CVPaciente.DefensaH3.CONTROLLER;

import com.CVPaciente.DefensaH3.DefensaH3Application;
import com.CVPaciente.DefensaH3.MODEL.DCVModel;
import com.CVPaciente.DefensaH3.SERVICE.DCVService;
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
    private DCVService dcvService;

//    @PostMapping("/coronaVirusPaciente")
//    public ResponseEntity save(@RequestBody DCVModel dcvModel){
//        try {
//            return  new ResponseEntity(dcvService.save(dcvModel), HttpStatus.CREATED);
//        }catch (Exception e){
//            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
//        }
//    }

    @PostMapping("/coronaVirusPaciente1")
    public ResponseEntity save(@RequestBody DCVModel cvModel){
        try{
            if (cvModel.getEdadPaciente()>70) {
                return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
            } else {
                return new ResponseEntity<>(dcvService.save(cvModel),HttpStatus.CREATED);
            }
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
    }





    @PutMapping("/coronaVirusPaciente/{IDCoronaV}")
    public ResponseEntity<DCVModel> update(@PathVariable("IDCoronaV") Integer IDCoronaV, @RequestBody DCVModel pacientModel){
        try {
            DCVModel pUdat = dcvService.update(pacientModel, IDCoronaV);
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
    public ResponseEntity<List<DCVModel>> GetAllPaciente(){
        try {
            List<DCVModel> pacients = dcvService.GetAllPaciente();
            if (pacients.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(pacients, HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/coronaVirusPaciente/getOne/{IDCoronaV}")
    public ResponseEntity<DCVModel> GetPacienteByIDCoronaV(@PathVariable("IDCoronaV") Integer IDCoronaV){
        try {
            DCVModel pModel = dcvService.GetPacienteByIDCoronaV(IDCoronaV);
            if (pModel != null){
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/paciente/{IDCoronaV}")
    public ResponseEntity<String> delete(@PathVariable("IDCoronaV") Integer IDCoronaV){
        try {
            dcvService.delete(IDCoronaV);
            return new ResponseEntity<>("DataBase sccesfully deleted", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
