package who.programador.mm.patientmodule.services;

import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;

public interface IPatientService {
    Long post(PatientRequestDTO patientRequestDTO);
}
