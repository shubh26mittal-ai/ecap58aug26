package collections.mapcollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapCollectionClass {

	public static void main(String[] args) {
		LinkedHashMap users = new LinkedHashMap();
		users.put(1, "shubh");
		users.put("hii", "shubh");
		users.put(true, "shubh");
		users.put(4, "shubh");
		users.put(5, "shubh");
		users.put('a', "shubh");
		users.put(4.3, "shubh");
		users.put(8, "shubh");
		System.out.println(users);//{1=shubh, hii=shubh, true=shubh, 4=shubh, 5=shubh, a=shubh, 4.3=shubh, 8=shubh}
	}

}
