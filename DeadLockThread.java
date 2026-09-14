package multithreading;

public class DeadLockThread extends Thread{
	static Thread t;
	public void run()
	{
		try {
			t.join();
		}
		catch(Exception e)
		{
			
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println("user define thread");
		}
	}

	public static void main(String[] args) throws InterruptedException{
		t = Thread.currentThread();
		DeadLockThread d = new DeadLockThread ();
		d.start();
		d.join();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
		

	}

}
