package who.programador.mm.patientmodule.model.dtos;

import lombok.Getter;
import lombok.Setter;
import who.programador.mm.patientmodule.model.enums.LogicOperatorType;

@Getter
@Setter
public class PatientFilterDTO {
    private String name;
    private String cpf;
    private String address;
    private String phone;
    private LogicOperatorType logicOperator;
}
