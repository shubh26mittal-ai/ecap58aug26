package collections.mapcollections;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	//	Map m = new HashMap();
		//System.out.println(m);//{}
		//m.put(1, 10);
		//m.put(2, "Hello");
		//m.put(3, true);
		//m.put(4, 5.34);
		//m.put(5, 'a');
		//System.out.println(m);//{1=10, 2=Hello, 3=true, 4=5.34, 5=a}
		
//		Map m = new HashMap();
//		System.out.println(m);//{}
//		m.put(1, 10);
//		m.put("bye", "Hello");
//		m.put(false, true);
//		m.put('g', 5.34);
//		m.put(5.43, 'a');
//		System.out.println(m);//{1=10, false=true, g=5.34, 5.43=a, bye=Hello}
		
//		Map m = new HashMap();
//		System.out.println(m);//{}
//		m.put(1, 10);
//		m.put(2, "Hello");
//		m.put(3, true);
//		m.put(4, 10);
//		m.put(5, 'a');
//		m.put(6, true);
		//System.out.println(m);//{1=10, 2=Hello, 3=true, 4=10, 5=a, 6=true}
//		System.out.println(m.size());//6
//		System.out.println(m.get(5));//a
//		System.out.println(m.containsKey(6));//true
//		System.out.println(m.containsKey(9));//false
//		System.out.println(m.containsValue("hello"));//true
//		System.out.println(m.containsValue("bye"));//false
		
		Map m = new HashMap();
		System.out.println(m);//{}
		m.put(1, 10);
		m.put(2, "Hello");
		m.put(3, true);
		m.put(4, 10);
		m.put(5, 'a');
		m.put(6, true);
		
		Set s = m.keySet();
		System.out.println(s);//[1, 2, 3, 4, 5, 6]
		
		Collection c = m.values();
		System.out.println(c);//[10, Hello, true, 10, a, true]
		
		Set entry = m.entrySet();
        System.out.println(entry);//[1=10, 2=Hello, 3=true, 4=10, 5=a, 6=true]


	}

}
