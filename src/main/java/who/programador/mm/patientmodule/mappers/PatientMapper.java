package who.programador.mm.patientmodule.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.entities.Patient;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    @Mapping(target = "id", ignore = true)
    Patient convert(PatientRequestDTO patientRequestDTO);
}
