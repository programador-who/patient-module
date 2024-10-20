package who.programador.mm.patientmodule.services;

import who.programador.mm.patientmodule.model.dtos.HistoryMedicalRequestDTO;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalResponseDTO;

public interface IHistoryMedicalService {
    HistoryMedicalResponseDTO create(HistoryMedicalRequestDTO historyMedicalRequestDTO);
}
