package multithreading;

public class ExecutorServiceClass implements Runnable{
	public void run()
	{
		System.out.println("Task executed by:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
