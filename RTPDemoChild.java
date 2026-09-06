package polymorph;

public class RTPDemoChild extends RTPDemoClass1 {

    public void simple() {
        System.out.println("simple method without formal parameters from parent class");
    }

    public int add(int a, int b) {
        return a + b;
    }

    static void m1() {
        System.out.println("child static method");
    }
   // final void finalMethod() {
     //   System.out.println("final method");
    //}
    

    private void privateMethod() {
        System.out.println("private method from child");
    }

    public static void main(String[] args) {
        RTPDemoChild r = new RTPDemoChild();

        r.simple();

        int res = r.add(5, 10);
        System.out.println(res);       // 15

        int res1 = r.add(10, 50);
        System.out.println(res1);      // 60

        m1();                          // child static method

        r.privateMethod();             // ← FIXED: "privete" → "private"
    }
}

