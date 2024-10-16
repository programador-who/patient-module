package who.programador.mm.patientmodule.specifications;

import org.springframework.data.jpa.domain.Specification;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.entities.Patient;
import who.programador.mm.patientmodule.model.enums.LogicOperatorType;

public class PatientSpecificationBuilder {
    public Specification<Patient> buildSpecification(PatientFilterDTO patientFilterDTO) {
        if (patientFilterDTO.getLogicOperator().equals(LogicOperatorType.OR)) {
            return buildOrSpecification(patientFilterDTO);
        }
        return buildAndSpecification(patientFilterDTO);
    }

    public Specification<Patient> buildOrSpecification(PatientFilterDTO patientFilterDTO) {
        Specification<Patient> specification = Specification.where(PatientSpecification.withName(patientFilterDTO.getName()));
        specification = specification.or(PatientSpecification.withCpf(patientFilterDTO.getCpf()));
        specification = specification.or(PatientSpecification.withAddress(patientFilterDTO.getAddress()));
        specification = specification.or(PatientSpecification.withPhone(patientFilterDTO.getPhone()));
        return specification;
    }

    public Specification<Patient> buildAndSpecification(PatientFilterDTO patientFilterDTO) {
        Specification<Patient> specification = Specification.where(PatientSpecification.withName(patientFilterDTO.getName()));
        specification = specification.and(PatientSpecification.withCpf(patientFilterDTO.getCpf()));
        specification = specification.and(PatientSpecification.withAddress(patientFilterDTO.getAddress()));
        specification = specification.and(PatientSpecification.withPhone(patientFilterDTO.getPhone()));
        return specification;
    }
}
