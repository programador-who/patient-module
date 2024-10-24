package who.programador.mm.patientmodule.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import who.programador.mm.patientmodule.model.dtos.PatientRequestDTO;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class PatientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void post() throws Exception {
        // Arrange
        PatientRequestDTO patientRequestDTO = new PatientRequestDTO();
        patientRequestDTO.setName("James");
        patientRequestDTO.setCpf("01909823499");
        patientRequestDTO.setAddress("Rua B");
        patientRequestDTO.setPhone("1234567890");

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.post("/patient")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(patientRequestDTO)))
                .andExpect(MockMvcResultMatchers.status().isCreated());

    }

    @Test
    void putAndGet() throws Exception {
        // Arrange
        PatientRequestDTO patientRequestDTO = new PatientRequestDTO();
        patientRequestDTO.setName("James Dean");
        patientRequestDTO.setCpf("01909823499");
        patientRequestDTO.setAddress("Rua B");
        patientRequestDTO.setPhone("1234567890");

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.put("/patient/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(patientRequestDTO)))
                .andExpect(MockMvcResultMatchers.status().isOk());


        mockMvc.perform(MockMvcRequestBuilders.get("/patient")
                        .param("name", "James Dean")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].name")
                        .value("James Dean"));

    }
}