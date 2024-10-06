package who.programador.mm.patientmodule.model.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientRequestDTO {
    private Long id;
    private String name;
    private String cpf;
    private String address;
    private String phone;
}
