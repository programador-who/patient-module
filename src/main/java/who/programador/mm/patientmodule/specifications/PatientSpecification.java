package who.programador.mm.patientmodule.specifications;

import org.springframework.data.jpa.domain.Specification;
import who.programador.mm.patientmodule.model.entities.Patient;

public class PatientSpecification {
    private PatientSpecification() {
        throw new IllegalStateException("Utility class");
    }

    public static Specification<Patient> withName(String name){
        return (root, query, cb) -> name == null ? null : cb.equal(root.get("name"), name);
    }

    public static Specification<Patient> withCpf(String cpf){
        return (root, query, cb) -> cpf == null ? null : cb.equal(root.get("cpf"), cpf);
    }

    public static Specification<Patient> withAddress(String address){
        return (root, query, cb) -> address == null ? null : cb.equal(root.get("address"), address);
    }

    public static Specification<Patient> withPhone(String phone){
        return (root, query, cb) -> phone == null ? null : cb.equal(root.get("phone"), phone);
    }
}
