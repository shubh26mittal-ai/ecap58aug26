package multithreading;

//public class PriorityThreadExample extends Thread{
	//public void run()
	//{
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
	//}

	//public static void main(String[] args) {
		//PriorityThreadExample p = new PriorityThreadExample();
		//p.start();
		
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(11);
		//Thread.currentThread().setPriority(4);
		//System.out.println(Thread.currentThread().getPriority());

	//}//main,5,4,Thread-0,5,10
	

//}

public class PriorityThreadExample extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
	public static void main (String[]args)
	{
		PriorityThreadExample p = new PriorityThreadExample();
		System.out.println(p.getName());
		System.out.println(p.getPriority());
		p.setPriority(8);
		System.out.println(p.getPriority());
		
		p.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
}