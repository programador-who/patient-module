package who.programador.mm.patientmodule.model.dtos;

import lombok.Getter;
import lombok.Setter;
import who.programador.mm.patientmodule.model.entities.Patient;

@Getter
@Setter
public class HistoryMedicalResponseDTO {
    private String description;
    private String date;
    private Patient patient;
}
