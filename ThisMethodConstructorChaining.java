package polymorph;

//public class ThisMethodConstructorChaining {

  //  ThisMethodConstructorChaining()
    //{
      //  this("Hello", "Hii");//Hello Hii
        //System.out.println("Default constructor without parameter");
    //}

    //ThisMethodConstructorChaining(int a, int b)
    //{
      //  System.out.println(a + " " + b);
    //}

    //ThisMethodConstructorChaining(String s1, String s2)
    //{
    	//this(10,20);
        //System.out.println(s1 + " " + s2); //10 20       // ← FIX: + lagaya
    //}

    //public static void main(String[] args) {
      //  new ThisMethodConstructorChaining();//Default constructor without parameter
       // new ThisMethodConstructorChaining(5, 10);//5 10
    //}
//}

public class ThisMethodConstructorChaining {

    ThisMethodConstructorChaining()
    {
    	System.out.println("Default constructor without parameter");//Default constructor without parameter
    }
    ThisMethodConstructorChaining(int a, int b)
    {
    	this();
    	System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
    	new ThisMethodConstructorChaining(5, 6);//5 6
    }
    }