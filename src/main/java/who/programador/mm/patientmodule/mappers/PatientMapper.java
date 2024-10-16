package who.programador.mm.patientmodule.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.entities.Patient;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    @Mapping(target = "id", ignore = true)
    Patient convert(PatientFilterDTO patientFilterDTO);
}
