package exceptions;

public class NumberTooLargeException extends Exception {
    private int number;

    public NumberTooLargeException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String getMessage() {
        return String.format("Number %d is too large", number);
    }
}
