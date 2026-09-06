package polymorph;

public class SuperMethodChild extends SuperMethodParent{

    SuperMethodChild()
    {
        super();
        System.out.println("child class constructor");//child class constructor

    }

    public static void main(String[] args) {
        new SuperMethodChild();    // ← FIX: capital M
    }
}

