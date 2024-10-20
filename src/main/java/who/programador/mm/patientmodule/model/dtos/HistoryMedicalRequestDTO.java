package who.programador.mm.patientmodule.model.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryMedicalRequestDTO {
    private String description;
    private String date;
    private String cpf;
}
