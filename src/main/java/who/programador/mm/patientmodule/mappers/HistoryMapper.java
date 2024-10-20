package who.programador.mm.patientmodule.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalRequestDTO;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalResponseDTO;
import who.programador.mm.patientmodule.model.entities.HistoryMedical;

@Mapper(componentModel = "spring")
public interface HistoryMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "patient", ignore = true)
    HistoryMedical toEntity(HistoryMedicalRequestDTO historyMedicalRequestDTO);

    HistoryMedicalResponseDTO toResponseDTO(HistoryMedical historyMedical);
}
