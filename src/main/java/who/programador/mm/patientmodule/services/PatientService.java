package who.programador.mm.patientmodule.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.entities.Patient;
import who.programador.mm.patientmodule.repositories.PatientRepository;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public void post(@RequestBody PatientRequestDTO patientRequestDTO) {
        Patient entity = new Patient();

        // TODO - Implemented mapping struct
        entity.setName(patientRequestDTO.getName());
        entity.setCpf(patientRequestDTO.getCpf());
        entity.setAddress(patientRequestDTO.getAddress());
        entity.setPhone(patientRequestDTO.getPhone());
        patientRepository.save(entity);
    }
}
