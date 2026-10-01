package frequencymap;
import java.util.HashMap;
import java.util.Map;
public class Demo {

	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map);            // {}

        for (int num : arr) {
            System.out.println(num);        // 10, 20, 10, 30, 20, 10
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);//{20=2, 10=3, 30=1}

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());//20 -> 2,10 -> 3,30 -> 1
        }
    }
}
