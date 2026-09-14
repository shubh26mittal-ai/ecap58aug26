package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("Shubh.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File you are searching is not present in the system");
        }
    }
}
package exceptions;
class Demo extends Object
{
    @Override
    public void finalize()
    {
       System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        d = null;  

        System.gc();                   
    }
}
class Demo
{
    public void m1() throws InterruptedException   // called method
    {
        Thread.sleep(5000);
    }

     public void m2()   // caller method
     {
         try {
             this.m1();
             System.out.println("Thread is working fine now...");
         }
         catch(InterruptedException e)
         {
             System.out.println("Thread got sleep");
         }
     }

    public void m2() throws InterruptedException
    {
        this.m1();
    }

    public void m3() throws InterruptedException   // caller method
    {
        this.m2();
    }

    public static void main(String[] args) throws InterruptedException
    {
        Demo d = new Demo();
        d.m3();
    }
}

