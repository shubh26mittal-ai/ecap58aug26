package collections.setcollections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetImplClassGenreralPrograms {

	//public static void main(String[] args) {
		//HashSet<String> emails = new HashSet<String>();
		//emails.add("shubh26mittal@gmail.com");
		//emails.add("shubh26mittal@gmail.com");
		//emails.add("shubh26mittal@gmail.com");
		//emails.add("shubh26mittal@gmail.com");
		//System.out.println(emails);//[shubh26mittal@gmail.com]
		

	//}

//}
	
	//public static void main(String[] args) {
		//LinkedHashSet<String> searchProduct = new LinkedHashSet<String>();
		//searchProduct.add("Laptop");
		//searchProduct.add("Mobile");
		//searchProduct.add("tshirt");
		//searchProduct.add("Charger");
		//System.out.println(searchProduct);//[Laptop, Mobile, tshirt, Charger]
	//}
//}
	
	public static void main(String[] args) {
		TreeSet<Integer> salary = new TreeSet<Integer>();
		salary.add(5000);
        salary.add(70000);
        salary.add(45000);
        salary.add(60000);
        salary.add(50000);
        salary.add(45000);
        System.out.println(salary);//[5000, 45000, 50000, 60000, 70000]
	}
}