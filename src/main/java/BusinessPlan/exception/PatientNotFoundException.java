package BusinessPlan.exception;

public class PatientNotFoundException extends RuntimeException {

    public PatientNotFoundException(String error) {
        super(error);
    }

    public PatientNotFoundException() {
        super("The patient provided does not exist.");
    }
}
