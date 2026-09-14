package multithreading;

//public class DaemonExamples extends Thread{

	//public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		//System.out.println(Thread.currentThread().isDaemon());
		

	//}

//}
	//public class DaemonExamples extends Thread
	//{
		//public void run()
		//{
			//System.out.println(Thread.currentThread().getName());//Thread-0
			//System.out.println(Thread.currentThread().isDaemon());//false
		//}
		//public static void main(String[]args)
		//{
			//DaemonExamples d = new DaemonExamples();
			//System.out.println(d.getName());//Thread-0
			//System.out.println(d.isDaemon());//false
			//d.setDaemon(true);//true
			//System.out.println(d.isDaemon());//true
			//d.start();
		//}
	//}
	public class DaemonExamples extends Thread{
		public void run()
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println("child thread");
				try {
					Thread.sleep(3000);
					System.out.println("child thread");
				}catch (Exception e)
				{
			}
		}
}
	public static void main(String[]args) 
	{
		DaemonExamples d = new DaemonExamples();
		d.setDaemon(true);//true
		System.out.println(d.isDaemon());//main thread
		d.start();
		System.out.println("main thread");//child thread
		}
		
	}
		

