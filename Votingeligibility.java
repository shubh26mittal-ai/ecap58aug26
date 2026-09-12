package exceptions;
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    void isEligible(int age) throws InvalidAgeException {

        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            throw new InvalidAgeException("Not eligible for voting");
        }
    }

    public static void main(String[] args) {

        Main vote = new Main();

        try {
            vote.isEligible(25);
            vote.isEligible(16);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Given age is not eligible");
        }
    }
}