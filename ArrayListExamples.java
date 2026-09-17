package collections.listcollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class ArrayListExamples {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//System.out.println(al);//[10, 20, 30]
		
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add("Hii");
		//al.add(true);
		//System.out.println(al);//[10, Hii, true]
		
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(1000);
		//al.add("Hii");
		//al.add(1000);
		//al.add(true);
		//al.add(null);
		//al.add(null);
		//System.out.println(al);//[10, 1000, Hii, 1000, true, null, null]
		

		    	//add()
		        // The list you want to copy FROM — this was missing
		     //   ArrayList al = new ArrayList();
		       // al.add(10);
		       // al.add(20);
		        //al.add(30);
		        //System.out.println(al);
		      //addAll()

		        //ArrayList al1 = new ArrayList();
		        //al1.add(100);
		        //al1.add(200);
		        //al1.add(300);
		        //al1.addAll(al);          // now 'al' exists, no error
		        //System.out.println(al1);//[100, 200, 300, 10, 20, 30]
		
		//get()
		
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		//al.add(50);
		//System.out.println(al);//[10, 20, 30, 40, 50]
		
		//set()
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		//al.add(50);
		//System.out.println(al);//[10, 20, 30, 40, 50]
		//al.set(3, "Hii");
		//System.out.println(al);//[10, 20, 30, Hii, 50]
		//System.out.println(al.indexOf(20));        // 1
		//System.out.println(al.lastIndexOf(40));    // -1  (40 was replaced by "Hii")
		//System.out.println(al.lastIndexOf("Hii")); // 3
		//System.out.println(al.size()); 
		
		//subList()
		//ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		//al.add(50);
		//System.out.println(al);              // [10, 20, 30, 40, 50]
		//List l1 = al.subList(1, 3);
        //System.out.println(l1);              // [20, 30]
        //List l2 = al.subList(1, 4);
        //System.out.println(l2); //[20, 30, 40]
        
        //contain()
        //ArrayList al = new ArrayList();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		//al.add(50);
		//System.out.println(al.contains(30));//true
		//System.out.println(al.contains(80));//false
		//sort()
		// ArrayList al = new ArrayList();
			//al.add(8);
			//al.add(1);
			//al.add(4);
			//al.add(9);
			//al.add(2);
			//al.add(5);
			//al.add(3);
			//al.add(6);
			//al.add(7);
			//System.out.println(al);//[8, 1, 4, 9, 2, 5, 3, 6, 7]
			//Collections.sort(al);
			//System.out.println(al);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
			//Collections.sort(al,Collections.reverseOrder());
			//System.out.println(al);//[9, 8, 7, 6, 5, 4, 3, 2, 1]
		//reverse index()
		//ArrayList al = new ArrayList();
		//al.add(8);
		//al.add(1);
		//al.add(4);
		//al.add(9);
		//al.add(2);
		//al.add(5);
		//al.add(3);
		//al.add(6);
		//al.add(7);
		//Collections.reverse(al);
		//System.out.println(al);//[7, 6, 3, 5, 2, 9, 4, 1, 8]
//remove (index)		
		//ArrayList al = new ArrayList();
		//al.add(8);
		//al.add(1);
		//al.add(4);
		//al.add(9);
		//al.add(2);
		//al.add(5);
		//al.add(3);
		//al.add(6);
		//al.add(7);
		//System.out.println(al);//[8, 1, 4, 9, 2, 5, 3, 6, 7]
		//al.remove(3);
		//System.out.println(al);//[8, 1, 4, 2, 5, 3, 6, 7]
		
		
		//ArrayList al = new ArrayList();
		//al.add(8);
		//al.add(1);
		//al.add(4);
		//al.add(9);
		//al.add(2);
		//al.add(5);
		//al.add(3);
		//al.add(6);
		//al.add(7);
		//Integer x1 = (Integer)Collections.max(al);
		//System.out.println(x1);//9
		//Integer x2 = (Integer)Collections.min(al);
		//System.out.println(x2);//1
		
		//equals()
		//ArrayList al1 = new ArrayList();
		//al1.add(1);
		//al1.add(2);
		//al1.add(3);
		
		//ArrayList al2 = new ArrayList();
		//al2.add(1);
		//al2.add(2);
		//al2.add(3);
		//Boolean b1 = al1.equals(al2);    // 'all' corrected to 'al1'
		//System.out.println(b1);//true
		
		//ArrayList al1 = new ArrayList();
		//al1.add(1);
		//al1.add(2);
		//al1.add(3);
		
		//ArrayList al2 = new ArrayList();
		//al2.add(1);
		//al2.add(2);
		//al2.add(8);
		//Boolean b1 = al1.equals(al2);    
		//System.out.println(b1);//false
		
		//asList()
		//String[] users = {"Shubh","Srija","Akansha","harsh","priya"};
		//System.out.println(Arrays.toString(users));//[Shubh, Srija, Akansha, harsh, priya]
		//List l1 = Arrays.asList(users);
		//System.out.println(l1);//[Shubh, Srija, Akansha, harsh, priya]
		
		//clear()
		//ArrayList al1 = new ArrayList();
		//al1.add(1);
		//al1.add(2);
		//al1.add(3);
		//System.out.println(al1);//[1, 2, 3]
		//al1.clear();
		//System.out.println(al1);//[]
		
		//off()
		//List l1 = List.of(5,4,3,2,1);
		//System.out.println(l1);//[5, 4, 3, 2, 1]
		
		//clone()
		//shallow copy()
		//ArrayList al1 = new ArrayList();
		//al1.add(10);
		//al1.add(20);
		//al1.add(30);
		//System.out.println(al1);//[10, 20, 30]
		
		//ArrayList al2 = (ArrayList)al1.clone();
		//al2.set(1,"Bye");
		//System.out.println(al2);//[10, Bye, 30]
		//System.out.println(al1);//[10, 20, 30]
		
		//deepcopy()
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);//[10, 20, 30]
		
		ArrayList al2 = al1;
		al2.set(1,"Bye");
		System.out.println(al2);//[10, Bye, 30]
		System.out.println(al1);//[10, Bye, 30]
		

		
		
		
		
		

	}

}
