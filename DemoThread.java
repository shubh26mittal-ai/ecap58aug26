package multithreading;

public class DemoThread extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());//Thread-0
		Thread.currentThread().setName("userdefine-thread");
		System.out.println(Thread.currentThread().getName());//userdefine-thread
	}

	public static void main(String[] args) {
		DemoThread d = new DemoThread();
		//d.run();
		d.start();
		System.out.println(d.getName());//Thread-0
		d.setName("Demo-thread-1");
		System.out.println(d.getName());//Demo-thread-1
		
		System.out.println(Thread.currentThread().getName());//main
		Thread.currentThread().setName("demo-thread");
		System.out.println(Thread.currentThread().getName());//demo-thread
		

	}

}
