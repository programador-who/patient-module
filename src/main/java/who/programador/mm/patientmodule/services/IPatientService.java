package who.programador.mm.patientmodule.services;

import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;

public interface IPatientService {
    Long post(PatientFilterDTO patientFilterDTO);
}
