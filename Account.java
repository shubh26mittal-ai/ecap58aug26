package multithreading;

public class Account {
	int balance = 1500;
	
	void withdraw(int amt)
	{
		if(balance >= amt)
		{
			System.out.println(Thread.currentThread().getName()+" is withdrawn "+amt);
			balance = balance - amt ;
			System.out.println("remaining balance is:"+balance);
		}
	}

}
