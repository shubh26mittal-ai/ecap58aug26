package multithreading;

public class JoinMethodExamples extends Thread{
	
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		JoinMethodExamples j = new JoinMethodExamples();
		j.start();
	
			for(int i=1;i<=10;i++)
			{
				System.out.println("main thread");
		}

	}

}
