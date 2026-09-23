package java8features;

//public class DemoImplClass implements Demo{
//	public void simple()
//	{
//		System.out.println("simple abstract method overridden");//simple abstract method overridden

//	}

//	public static void main(String[] args) {
//		DemoImplClass d = new DemoImplClass();
//		d.simple();
		

//	}

//}

//	Lambdaexpression

	//public class DemoImplClass{
		
		//public static void main(String[] args) {
//			case1
//			Demo d = ()->System.out.println("Lambda expression/anonymus method passed to simple method");
//			d.simple();//Lambda expression/anonymus method passed to simple method
			
//			case2
//			 Demo d = () -> {
//		            System.out.println("Hello");
//		            System.out.println("Welcome");
//		            System.out.println("Bye");
//		        };   // semicolon closes the lambda assignment
//		        d.simple();//Hello,Welcome,Bye
			
			//case3 
//			interface Demo {
//				void show(int a, int b);   // method name must match the call: d.username(...)
//			}
//			 Demo d = (int a, int b) -> System.out.println(a + b);
//		        d.show(5, 10); //15         // ✅ call 'show', not 'add'

//		        Demo d1 = (a, b) -> System.out.println(a + b);
//		        d1.show(5, 10);  //15       // ✅ call 'show', not 'add'
//		    }
//		}
			
//			case4
			//interface Demo {
			  //  void username(String name);   // method name must match the call: d.username(...)
			//}

			
			    
			  //      Demo d = name -> System.out.println(name);
			    //    d.username("Shubh");//Shubh
			    //}
			//}
//			case5 return
			//Demo d1 = (a,b)->{
				//return a+b;
			//};
			//int result = d1.add(5, 3);
			//System.out.println(result);//8
			
			//Demo d2 = (a,b)->a+b;
			//int res = d2.add(10, 20);
			//System.out.println(res);//30
			
			
		//}
	//}
//public class DemoImplClass{
//	public static void main(String[]args) {
//		Demo d = ()->System.out.println("call with airtel");
//		d.makeACall();
//		Demo.settings();
//		Demo.garbageClean();//call with airtel,Settings from a phone,unwanted memory cleaning
//	}
//}

public class DemoImplClass implements Demo {

    public void makeACall() {                // error 1 fixed
        System.out.println("make a call with jio");
    }
public static void main(String[]args) {
  Demo d = ()->System.out.println("call with airtel");
  d.makeACall();
  
  Demo d1 = new DemoImplClass();
  d1.youtube();
  d1.whatsapp();
  }
}
	