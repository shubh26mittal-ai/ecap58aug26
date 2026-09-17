package collections.listcollections;
import java.util.Vector;
public class VectorExamples {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(10);
		v1.add("hii");
		v1.add(true);
		v1.add(1.1);
		v1.add(null);
		System.out.print(v1);//[10, hii, true, 1.1],[10, hii, true, 1.1, null]

	}

}
