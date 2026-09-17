package collections.setcollections;
import java.util.LinkedHashSet;
public class LinkedHashSetClass {

	//public static void main(String[] args) {
		//LinkedHashSet lhs = new LinkedHashSet();
		//lhs.add(10);
		//lhs.add("Hello");
		//lhs.add(true);
//		lhs.add(1.23f);
//		lhs.add('a');
//		System.out.println(lhs);//[10, Hello, true, 1.23, a]
		

//	}

//}

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add("Hello");
		lhs.add(true);
		lhs.add(1.23f);
		lhs.add('a');
		lhs.add(null);
		System.out.println(lhs);//[10, Hello, true, 1.23, a, null]
	}
}