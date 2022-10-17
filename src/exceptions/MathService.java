package exceptions;

public class MathService {

    public static int getMaxNumber(){
        return 10000;
    }

    public static int computePower(int number, int power) throws NumberTooLargeException, PowerTooLargeException {
        if (power > 10) {
            throw new PowerTooLargeException("Power is too large");
        }
        if (number > getMaxNumber()) {
            throw new NumberTooLargeException(number);
        }
        return (int) Math.pow(number, power);
    }
}
