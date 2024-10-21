package who.programador.mm.patientmodule.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;
import who.programador.mm.patientmodule.model.dtos.PatientResponseDTO;
import who.programador.mm.patientmodule.services.PatientService;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("patient")
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody PatientRequestDTO patientRequestDTO) {
        log.info("POST /patient {}", patientRequestDTO);
        Long id = patientService.create(patientRequestDTO);
        URI location = URI.create(String.format("/patient/%d", id));
        return ResponseEntity.created(location).build();
    }

    @GetMapping
    public ResponseEntity<Page<PatientResponseDTO>> getByFilter(@ParameterObject PatientFilterDTO patientFilterDTO) {
        Page<PatientResponseDTO> patientByFilter = patientService.getByFilter(patientFilterDTO);
        return ResponseEntity.ok(patientByFilter);
    }
}
