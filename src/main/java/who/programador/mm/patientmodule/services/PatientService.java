package who.programador.mm.patientmodule.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import who.programador.mm.patientmodule.mappers.PatientMapper;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.dtos.PatientResponseDTO;
import who.programador.mm.patientmodule.model.entities.Patient;
import who.programador.mm.patientmodule.repositories.PatientRepository;
import who.programador.mm.patientmodule.specifications.IPatientSpecificationBuilder;


@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;
    private final IPatientSpecificationBuilder patientSpecificationBuilder;

    public Long create(PatientRequestDTO patientRequestDTO) {
        Patient patientEntity = patientMapper.convert(patientRequestDTO);
        patientRepository.save(patientEntity);
        return patientEntity.getId();
    }

    public Patient findByCpf(String cpf) {
        return patientRepository.findByCpf(cpf);
    }

    public Page<PatientResponseDTO> getByFilter(PatientFilterDTO patientFilterDTO) {
        Specification<Patient> patientSpecification = patientSpecificationBuilder.buildSpecification(patientFilterDTO);
        Page<Patient> patientRepositoryAll = patientRepository.findAll(patientSpecification, patientFilterDTO.pageable());
        return patientMapper.convert(patientRepositoryAll);
    }
}
