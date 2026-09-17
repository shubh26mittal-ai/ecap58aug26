package collections.setcollections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class Demo {

	//public static void main(String[] args) {
		//Set<Object> s = new LinkedHashSet<>();
		//s.add(10);
		//s.add(5.5);
		//s.add(true);
		//s.add('1');
		//s.add("Hello");
		//System.out.println(s);//[10, 5.5, true, 1, Hello]

		

	//}

//}
	
	//public static void main(String[] args) {
		// Set s = new HashSet();
		//s.add(10);
		//s.add(5.5);
		//s.add(true);
		//s.add('1');
		//s.add("Hello");
		//System.out.println(s);//[1, Hello, 5.5, 10, true]
	//}
//}
	
	public static void main(String[] args) {
		 Set s = new HashSet();
		s.add(10);
		s.add(5.5);
		s.add(true);
		s.add('1');
		s.add("Hello");
		s.add(null);
		System.out.println(s);//[null, 1, Hello, 5.5, 10, true]

	}
}
