package who.programador.mm.patientmodule.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionPatient {
    private int code;
    private String message;
}
