package collections.mapcollections;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;
public class UtilityMethods {

	public static void main(String[] args) {
		//List n = new ArrayList();
		//n.add(50);
		//n.add(10);
		//n.add(40);
		//n.add(20);
		//n.add(30);
		//sort()
		//Collections.sort(n);
		//System.out.println(n);//[10, 20, 30, 40, 50]
		//Collections.sort(n,Collections.reverseOrder());
		//System.out.println(n);//[50, 40, 30, 20, 10]
		
		//reverse()
		//Collections.reverse(n);
		//System.out.println(n);//[30, 20, 40, 10, 50]
		
		//shuffle()
//		System.out.println(n);//[50, 10, 40, 20, 30]
//		Collections.shuffle(n);
//		System.out.println(n);//[30, 10, 50, 20, 40]
		
		//swap()
		//List ch = new ArrayList();
		//ch.add("A");
		//ch.add("B");
		//ch.add("C");
		//ch.add("D");
        //System.out.println(ch);//[A, B, C, D]
        //Collections.swap(ch,1,3);
        //System.out.println(ch);//[A, D, C, B]
		
		//max()&min()
//		List n = new ArrayList();
//		n.add(50);
//		n.add(10);
//		n.add(40);
//		n.add(20);
//		n.add(30);
//		System.out.println(n);
//		int maxvalue = (Integer)Collections.max(n);
//		System.out.println(maxvalue);//50
//		int minvalue = (Integer)Collections.min(n);
//		System.out.println(minvalue);//10
		
		//frequency()
//		List l1 = Arrays.asList(10,20,30,10,40,10);
//		int count = Collections.frequency(l1,10);
//		System.out.println(count);//3
		
		//binarysearch()
//		List n = new ArrayList();
//		n.add(10);
//		n.add(20);
//		n.add(30);
//		n.add(40);
//		n.add(50);
//		System.out.println(n);//[10, 20, 30, 40, 50]
//		int i = Collections.binarySearch(n, 40);
//		System.out.println(n);
//		System.out.println(i);//3
		
		//replaceAll()
//		List n = new ArrayList();
//		n.add(10);
//		n.add(20);
//		n.add(30);
//		n.add(40);
//		n.add(50);
//		Collections.replaceAll(n, 20, "Hii");
//		System.out.println(n);//[10, Hii, 30, 40, 50]
		
		//fill()
//		List n = new ArrayList();
//		n.add(10);
//		n.add(20);
//		n.add(30);
//		n.add(40);
//		n.add(50);
//		Collections.fill(n, 100);
//		System.out.println(n);//[100, 100, 100, 100, 100]
		
		//rotate()
		List n = new ArrayList();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		System.out.println(n);//[10, 20, 30, 40, 50]
		//Collections.rotate(n, 2);
		//System.out.println(n);//[40, 50, 10, 20, 30]
//		Collections.rotate(n, 3);
//		System.out.println(n);//[30, 40, 50, 10, 20]
		Collections.rotate(n, 11);
		System.out.println(n);//[50, 10, 20, 30, 40]
		
		
		
		
		
		
		
		

	}

}
