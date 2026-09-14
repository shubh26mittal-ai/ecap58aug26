package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class ExecutorImplClass {

	//public static void main(String[] args) {
	//	Thread t1 = new Thread(new ExecutorServiceClass());
		//Thread t2 = new Thread(new ExecutorServiceClass());
		//Thread t3 = new Thread(new ExecutorServiceClass());
		//t1.start();
		//t2.start();
		//t3.start();
//Task executed by:Thread-0,Task executed by:Thread-1,Task executed by:Thread-2
	//}

//}
public class ExecutorImplClass {
	public static void main(String[]args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.submit(new ExecutorServiceClass());
		service.shutdown();
//Task executed by:pool-1-thread-3,Task executed by:pool-1-thread-2,Task executed by:pool-1-thread-1
//Task executed by:pool-1-thread-1,Task executed by:pool-1-thread-3,Task executed by:pool-1-thread-2
//Task executed by:pool-1-thread-1,Task executed by:pool-1-thread-2,Task executed by:pool-1-thread-3
		}
}