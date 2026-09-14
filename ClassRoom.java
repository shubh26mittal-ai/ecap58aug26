package multithreading;
//asynchronous
//public class ClassRoom {
	//void takeClass(String faculty)
	//{
		//for (int i=1;i<=10;i++)
		//{
			//System.out.println("Class is taken by:"+faculty);
		//}
	//}

//}
//synchronous

public class ClassRoom {

    synchronized void takeClass(String faculty)
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Class is taken by : " + faculty);
        }
    }
}
 

