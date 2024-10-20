package who.programador.mm.patientmodule.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import who.programador.mm.patientmodule.mappers.HistoryMapper;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalRequestDTO;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalResponseDTO;
import who.programador.mm.patientmodule.model.entities.HistoryMedical;
import who.programador.mm.patientmodule.repositories.HistoryMedicalRepository;

@Service
@RequiredArgsConstructor
public class HistoryMedicalService implements IHistoryMedicalService {
    private final HistoryMedicalRepository historyMedicalRepository;
    private final PatientService patientService;
    private final HistoryMapper historyMapper;

    @Override
    public HistoryMedicalResponseDTO create(HistoryMedicalRequestDTO historyMedicalRequestDTO) {
        var patient = patientService.findByCpf(historyMedicalRequestDTO.getCpf());
        if (patient == null) {
            // TODO: Changed this exception to a custom exception
            throw new RuntimeException("Patient not found");
        }
        HistoryMedical historyMedical = historyMapper.toEntity(historyMedicalRequestDTO);
        historyMedical.setPatient(patient);
        HistoryMedical historyMedicalEntity = historyMedicalRepository.save(historyMedical);

        return historyMapper.toResponseDTO(historyMedicalEntity);
    }
}
