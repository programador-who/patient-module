package who.programador.mm.patientmodule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import who.programador.mm.patientmodule.model.entities.HistoryMedical;

public interface HistoryMedicalRepository extends JpaRepository<HistoryMedical, Long> {
}
