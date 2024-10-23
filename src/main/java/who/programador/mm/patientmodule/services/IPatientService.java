package who.programador.mm.patientmodule.services;

import org.springframework.data.domain.Page;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.dtos.PatientResponseDTO;
import who.programador.mm.patientmodule.model.entities.Patient;

public interface IPatientService {
    Long create(PatientRequestDTO patientRequestDTO);
    Patient findByCpf(String cpf);
    Page<PatientResponseDTO> getByFilter(PatientFilterDTO patientFilterDTO);
    PatientResponseDTO update(Long id, PatientRequestDTO patientRequestDTO);
}
