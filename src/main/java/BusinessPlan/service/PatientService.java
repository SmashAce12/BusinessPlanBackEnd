package BusinessPlan.service;

import BusinessPlan.model.Patient;
import BusinessPlan.repo.PatientRepo;
import BusinessPlan.exception.PatientNotFoundException;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class PatientService {

    private final PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient addPatient(Patient patient) {
        patient.setCode(UUID.randomUUID().toString());
        return patientRepo.save(patient);
    }

    public List<Patient> findAllPatients() {
        return patientRepo.findAll();
    }

    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public Patient findPatientById(Long id) {
        return patientRepo.findPatientById(id).
                orElseThrow(() -> new PatientNotFoundException("Patient with id " + id + " could not be found."));
    }

    public void deletePatient(Long id) {
        patientRepo.deletePatientById(id);
    }
}
