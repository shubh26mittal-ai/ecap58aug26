package interfaceexamples;

//public class AClassImpl implements A {

  //  public void m1() {
    //    System.out.println("m1 method from A interface");
    //}

    //public void m2() {
      //  System.out.println("m2 method from A interface");
    //}

    //public static void main(String[] args) {
      //  AClassImpl a1 = new AClassImpl();

        //a1.m1();      // m1 method from A interface
        //a1.m2();      // m2 method from A interface
       // A.test();     // static test() method of A interface
        //A.test1();    // static test1() method of A interface
        //a1.add(5, 5);//10
        //a1.mul(5, 2);//10
    //}
//}
public class AClassImpl implements A {
	public static void main(String[] args) {
        A.m1();                     // static method → called on interface

        AClassImpl obj = new AClassImpl();
        obj.m2();                   // default method → inherited, called on object
    }
}