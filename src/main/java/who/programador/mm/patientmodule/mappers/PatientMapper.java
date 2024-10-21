package who.programador.mm.patientmodule.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.dtos.PatientResponseDTO;
import who.programador.mm.patientmodule.model.entities.Patient;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    @Mapping(target = "id", ignore = true)
    Patient convert(PatientRequestDTO patientRequestDTO);

    default Page<PatientResponseDTO> convert(Page<Patient> page){
        return new PageImpl<>(this.convert(page.getContent()), page.getPageable(), page.getTotalElements());
    }

    List<PatientResponseDTO> convert(List<Patient> content);
}
