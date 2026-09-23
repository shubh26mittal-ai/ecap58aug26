package java8features;
import java.util.ArrayList;
public class ForEachLoopEx {

	public static void main(String[] args) {
//		ArrayList<String> users = new ArrayList<String>();
//		users.add("Shubh");
//		users.add("Vivek");
//		users.add("himanshu");
//		users.add("lovekush");
//		users.add("sagar");
//		users.add("mittal");
//		System.out.println(users);//[Shubh, Vivek, himanshu, lovekush, sagar, mittal]
		
//		users.forEach(user -> System.out.println(user));
		
		ArrayList<Integer> users = new ArrayList<>();

        users.add(1);
        users.add(2);
        users.add(3);
        users.add(4);
        users.add(5);

        users.forEach(x -> System.out.println(x));//12345

	}

}
