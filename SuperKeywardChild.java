package oops.inherit;

public class SuperKeywordChild extends SuperKeywordParent{
    int a = 100;

    public void m1()
    {
        System.out.println(a);//100 - child class ka a
        System.out.println(super.a);//10 - parent class ka a
        System.out.println("m1() method from sub class");
        super.m1(); // parent ka method call
    }
    public static void main(String[] args) {
        SuperKeywordChild sc = new SuperKeywordChild();
        System.out.println(sc.a); // 100
        sc.m1();
    }
}