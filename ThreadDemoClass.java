package multithreading;

//public class ThreadDemoClass extends Thread {

  //  public static void main(String[] args) {

    //    System.out.println(Thread.currentThread().getName());  // getName, not getname

      //  for (int i = 1; i <= 10; i++) {
        //    System.out.println("main thread");
        //}
    //}
//}


//public class ThreadDemoClass extends Thread {
	//public void run()
	//{
		//for (int i=1;i<=10;i++)
		//{
			//System.out.println("child thread");
		//}
	//}
	//public static void main(String[]args) {
		//ThreadDemoClass td = new ThreadDemoClass();
		//td.run();
		//td.start();
		
		//System.out.println(Thread.currentThread().getName());
		
		//for (int i=1;i<=10;i++)
		//{
			//System.out.println("main thread");
		//}
	//}
//}

public class ThreadDemoClass implements Runnable {
	
	public void run() 
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("user define thread");
		}
		
	}
	
	public static void main(String[]args)
	{
		ThreadDemoClass td = new ThreadDemoClass();
		//td.run();
		//td.start();
		Thread t = new Thread(td);
		t.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
		
	}
}