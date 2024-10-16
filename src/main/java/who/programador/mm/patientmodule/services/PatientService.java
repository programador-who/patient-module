package who.programador.mm.patientmodule.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import who.programador.mm.patientmodule.mappers.PatientMapper;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.entities.Patient;
import who.programador.mm.patientmodule.repositories.PatientRepository;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public Long post(PatientFilterDTO patientFilterDTO) {
        Patient patientEntity = patientMapper.convert(patientFilterDTO);
        patientRepository.save(patientEntity);
        return patientEntity.getId();
    }
}
