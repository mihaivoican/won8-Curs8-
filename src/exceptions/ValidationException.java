package exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends Exception {
    private List<String> errors = new ArrayList<>();

    public void addError(String error) {
        errors.add(error);
    }

    public static void main(String[] args) {
        try {
            validate();
        } catch (ValidationException e) {
        }
    }

    private static String validate() throws ValidationException {
        ValidationException validationException = new ValidationException();
        // validation for name length failed
        validationException.addError("Name was too long");
        //....
        // validation for address failed
        validationException.addError("Address was not valid");
        // other validations

        throw validationException;
    }
}
