package who.programador.mm.patientmodule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import who.programador.mm.patientmodule.model.entities.Patient;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRepository extends JpaRepository<Patient, Long>, JpaSpecificationExecutor<Patient> {
    Patient findByCpf(String cpf);
}