package casting;

public class Child extends Parent{
	String prop = "car";

    public static void main(String[] args) {
        //Child c1 = new Child();          // was: new child()
      //  System.out.println(c1.prop);//car
       // System.out.println(c1.land);//3acres
        
        //Parent p1 = new Parent();
        //System.out.println(p1.prop);//error
       // System.out.println(p1.land);
    	
    	//Parent p1 = new Child();//upcasting
        //System.out.println(p1.prop);//error
       // System.out.println(p1.land);
    	
    	//Child c1 = (Child) new Parent();
        //  System.out.println(c1.prop);
         // System.out.println(c1.land);
    	//Downcasting
    	Parent p1 = new Child();//upcasting
    	Child c1 = (Child)p1;//downcasting
    	System.out.println(c1.land);//3acres
    	System.out.println(c1.prop);//car
    	
        
    }
}
		

