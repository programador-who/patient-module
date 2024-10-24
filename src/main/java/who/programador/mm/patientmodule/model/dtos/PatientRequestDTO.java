package who.programador.mm.patientmodule.model.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientRequestDTO {
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "CPF cannot be null")
    private String cpf;
    @NotNull(message = "Address cannot be null")
    private String address;
    private String phone;
}
