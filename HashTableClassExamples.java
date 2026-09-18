package collections.mapcollections;
import java.util.Hashtable;
public class HashTableClassExamples {

	public static void main(String[] args) {
	        Hashtable ht = new Hashtable();
	        System.out.println(ht);
	        ht.put(1, 10);
	        ht.put(2, 20);
	        ht.put(3, "hii");
	        ht.put(4, true);
	        ht.put('a', 97);
	        ht.put(5, 20);
	        ht.put(6, "hii");
	        System.out.println(ht);//{a=97, 6=hii, 5=20, 4=true, 3=hii, 2=20, 1=10}
	}

}
