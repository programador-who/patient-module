package who.programador.mm.patientmodule.model.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import who.programador.mm.patientmodule.model.enums.LogicOperatorType;

@Getter
@Setter
public class PatientFilterDTO {
    @Parameter(description = "Name")
    private String name;
    @Parameter(description = "CPF")
    private String cpf;
    @Parameter(description = "Address")
    private String address;
    @Parameter(description = "Phone")
    private String phone;
    @Parameter(description = "Logic Operator Type")
    private LogicOperatorType logicOperator = LogicOperatorType.AND;
    private int page = 0;
    private int pageSize = 10;

    @JsonIgnore
    public Pageable pageable() {
        return PageRequest.of(this.getPage(), this.pageSize == -1 ? Integer.MAX_VALUE : this.pageSize);
    }
}
