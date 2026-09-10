package interfaceexamples;

public class CarLoan implements Loan {
    public void loan(int amt) {
        System.out.println(amt * 0.02);
    }

    public static void main(String[] args) {
        CarLoan cl = new CarLoan();
        cl.loan(500000);
    }
}
