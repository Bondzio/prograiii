package com.RcvS.CoronaVirusPaciente.REPO;

import com.RcvS.CoronaVirusPaciente.MODEL.CVPacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVPacienteRepo extends JpaRepository<CVPacienteModel, Integer> {
}
