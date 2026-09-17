package collections.listcollections;
import java.util.LinkedList;
public class ListLinkedClass {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("Hii");
		l1.add('a');
		l1.add(20);
		l1.add(10);
		l1.add(null);
		System.out.println(l1);//[10, 20, Hii, a, 20, 10, null]
		System.out.println(l1.get(2));//Hii
		l1.remove(6);
		System.out.println(l1);//[10, 20, Hii, a, 20, 10]

	}

}
