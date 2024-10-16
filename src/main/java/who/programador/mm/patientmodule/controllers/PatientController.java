package who.programador.mm.patientmodule.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import who.programador.mm.patientmodule.model.dtos.PatientFilterDTO;
import who.programador.mm.patientmodule.services.PatientService;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("patient")
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody PatientFilterDTO patientFilterDTO) {
        Long id = patientService.post(patientFilterDTO);
        URI location = URI.create(String.format("/patient/%d", id));
        return ResponseEntity.created(location).build();
    }
}
