package who.programador.mm.patientmodule.specifications;

import org.springframework.data.jpa.domain.Specification;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.entities.Patient;

public interface IPatientSpecificationBuilder {
    Specification<Patient> buildSpecification(PatientFilterDTO patientFilterDTO);
}
