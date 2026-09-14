package multithreading;

public class SleepThread extends Thread{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("shubh mittal");
			try {
				Thread.sleep(2500);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SleepThread s = new SleepThread();
		s.start();

	}

}
