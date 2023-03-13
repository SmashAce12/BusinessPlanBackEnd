package BusinessPlan.repo;

import BusinessPlan.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

    void deletePatientById(Long id);

    Optional<Patient> findPatientById(Long id);
}
