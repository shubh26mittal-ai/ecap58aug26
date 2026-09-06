package polymorph;

//public class ConstructorOverLoad {
//ConstructorOverLoad(){
	//System.out.println("Default constructor");//Default constructor
//}
	//public static void main(String[] args) {
	//ConstructorOverLoad co= new ConstructorOverLoad();	

	//}

//}
public class ConstructorOverLoad {

    ConstructorOverLoad()                          // ← FIX: capital C
    {
        System.out.println("Default constructor");
    }

    ConstructorOverLoad(int a, int b)
    {
        System.out.println(a + " " + b);
    }

    ConstructorOverLoad(String s, float f1)
    {
        System.out.println(s + " " + f1);
    }

    public static void main(String[] args) {
        new ConstructorOverLoad();//Default constructor
        new ConstructorOverLoad(10, 20);//10 20
        new ConstructorOverLoad("Hello", 10.45f);//Hello 10.45
    }
}



