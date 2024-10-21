package who.programador.mm.patientmodule.model.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientResponseDTO {
    private Long id;
    private String name;
    private String cpf;
    private String address;
    private String phone;
}
