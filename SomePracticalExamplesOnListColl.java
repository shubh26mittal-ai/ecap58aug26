package collections.listcollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
//public class SomePracticalExamplesOnListColl {
	
	//public static void main(String[] args) {
		//ArrayList cart = new ArrayList();
		//cart.add("Mobile");
		//cart.add("Laptop");
		//cart.add("tshirt");
		//System.out.println("cart:"+cart);//cart:[Mobile, Laptop, tshirt]
		//System.out.println("cart removed:"+cart.remove(2));//cart removed:tshirt
		//System.out.println("cart:"+cart);//cart:[Mobile, Laptop]
	//}
//}
//public class SomePracticalExamplesOnListColl {
	//public static void main(String[]args) {
		//ArrayList salary = new ArrayList();
		//salary.add(40000);
		//salary.add(55000);
		//salary.add(80000);
		//salary.add(73000);
		//salary.add(34000);
		//int highestSal = (int)Collections.max(salary);
		//System.out.println(highestSal);//80000
	//}
//}

//public class SomePracticalExamplesOnListColl {
// public static void main(String[] args) {
	// LinkedList<String> coach = new LinkedList<>();
	 //coach.add("s1");
       // coach.add("s2");
        //coach.add("s3");
        //System.out.println(coach);//[s1, s2, s3]
        //coach.addFirst("Engine");
        //coach.addLast("GC");
        //System.out.println(coach);//[Engine, s1, s2, s3, GC]
	//}
//}
//public class SomePracticalExamplesOnListColl {
	// public static void main(String[] args) {
		// Vector<String>products = new Vector<String>();
		// products.add("Laptop");
		 //products.add("Mobile");
		 //products.add("Mouse");
		 //products.remove(2);
		 //System.out.println("Out Of Stock:"+products.remove(2));//Out Of Stock:Mouse
		 //System.out.println("Inventory stock :"+products);//Inventory stock :[Laptop, Mobile]
	 //}
	 //}

public class SomePracticalExamplesOnListColl {
	 public static void main(String[] args) {
		 Stack calls = new Stack();
		 calls.push("main app");
		 calls.push("login cred");
		 calls.push("validate login");
		 calls.push("database");
		 //System.out.println(calls.empty));
		 System.out.println(calls);
		 while(!calls.empty());
		 {
			 System.out.println(calls.pop());//[main app, login cred, validate login, database]
} 
		 
	 }
}
	 