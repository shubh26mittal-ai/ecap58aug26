package multithreading;

public class AccontRaceCondition { 
	
	public static void main(String[]args) throws  InterruptedException {
		Account account = new Account();
		Thread t1 = new Thread(()->account.withdraw(1200));
		Thread t2 = new Thread(()->account.withdraw(1200));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("final balance :"+account.balance);
		//Thread-1 is withdrawn 1200,Thread-0 is withdrawn 1200,remaining balance is:300,remaining balance is:-900,final balance :-900
		
	}

}

