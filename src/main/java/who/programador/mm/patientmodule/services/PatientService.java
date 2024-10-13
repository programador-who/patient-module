package who.programador.mm.patientmodule.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import who.programador.mm.patientmodule.mappers.PatientMapper;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.entities.Patient;
import who.programador.mm.patientmodule.repositories.PatientRepository;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public Long post(PatientRequestDTO patientRequestDTO) {
        Patient patientEntity = patientMapper.convert(patientRequestDTO);
        patientRepository.save(patientEntity);
        return patientEntity.getId();
    }
}
