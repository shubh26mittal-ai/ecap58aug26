package stringsdsa;
import java.util.HashMap;
import java.util.Map;
public class AnagramString {

	public static void main(String[] args) {
		 String s1 = "listen";
	        String s2 = "silent";

	        if (s1.length() != s2.length()) {
	            System.out.println(false);
	            return;
	        }

	        HashMap<Character, Integer> map = new HashMap<>();

	        for (char ch : s1.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	            //System.out.println(ch);
	        }
	        System.out.println(map);//{s=1, t=1, e=1, i=1, l=1, n=1}

	        for (char ch : s2.toCharArray()) {

	            // Removed extra semicolon here
	            if (!map.containsKey(ch)) {
	                System.out.println(false);
	                return;
	            }

	            map.put(ch, map.get(ch) - 1);

	            if (map.get(ch) == 0) {
	                map.remove(ch);
	            }
	        }
            System.out.println(map);//{}
	        System.out.println(map.isEmpty());//true

	    }
	}
