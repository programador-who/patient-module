package who.programador.mm.patientmodule.repositories;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import who.programador.mm.patientmodule.model.entities.Patient;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ActiveProfiles("test")
public class PatientRepositoryTest {

    @Autowired
    PatientRepository patientRepository;

    @Test
    @DisplayName("Should return a patient by CPF")
    void findByCpfTest() {
        Patient byCpf = patientRepository.findByCpf("12345678901");
        assertNotNull(byCpf);
        assertThat(byCpf.getCpf()).isEqualTo("12345678901");
    }

}
