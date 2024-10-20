package who.programador.mm.patientmodule.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalRequestDTO;
import who.programador.mm.patientmodule.model.dtos.HistoryMedicalResponseDTO;
import who.programador.mm.patientmodule.services.IHistoryMedicalService;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/history-medical")
public class HistoryMedicalController {
    private final IHistoryMedicalService historyMedicalService;

    @PostMapping
    public ResponseEntity<HistoryMedicalResponseDTO> post(@RequestBody HistoryMedicalRequestDTO historyMedicalRequestDTO) {
        log.info("PUT /history-medical {}", historyMedicalRequestDTO);
        HistoryMedicalResponseDTO historyMedicalResponseDTO = historyMedicalService.create(historyMedicalRequestDTO);
        return ResponseEntity.ok(historyMedicalResponseDTO);
    }
}
