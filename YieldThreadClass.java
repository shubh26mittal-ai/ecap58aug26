package multithreading;

public class YieldThreadClass extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		 YieldThreadClass y = new  YieldThreadClass();
		 y.start();
		 y.yield();
		 for (int i=1;i<=10;i++)
		 {
			 System.out.println("main thread");
		 }
		
		

	}

}
