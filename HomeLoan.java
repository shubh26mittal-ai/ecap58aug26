package interfaceexamples;

public class HomeLoan implements Loan{
	 public void homeLoan(int amt) {
	        System.out.println(amt * 0.02);
	    }

	    public static void main(String[] args) {
	        HomeLoan h1 = new HomeLoan();
	        h1.homeLoan(100000);
	    }
	}
