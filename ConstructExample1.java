package polymorph;

//public class ConstructExample1 {
	//ConstructExample1()
	//{
	//	System.out.println("Constructor");//Constructor
	//}

	//public static void main(String[] args) {
		//new ConstructExample1();
		

	//}

//}
//public class ConstructExample1 {
	//ConstructExample1(int a, int b)
	//{
		//System.out.println(a);//5
		//System.out.println(b);//5
//	}

	//public static void main(String[] args) {
		//new ConstructExample1(5,5);
		//}
//}

//public class ConstructExample1
//{
  //  String firstName = "Shubh";
    //String lastName = "Mittal";

    //ConstructExample1()
    //{
    //}

    //public static void main(String[] args)
    //{
      //  ConstructExample1 x = new ConstructExample1();
        //System.out.println(x.firstName);
        //System.out.println(x.lastName);
    //}
//}

public class ConstructExample1
{
	String firstName;
	String lastName;
	ConstructExample1(String firstName, String lastName)   // ← lastName (capital N)
	{
	    this.firstName = firstName;
	    this.lastName  = lastName;    // ab lastName parameter match karega
	}

	public static void main(String[]args) {
		ConstructExample1 x= new ConstructExample1("Shubh","Mittal");
		System.out.println(x.firstName+" "+x.lastName);//Shubh Mittal
	}
}
