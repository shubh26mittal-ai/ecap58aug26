package stringsdsa;
import java.util.HashMap;
import java.util.Map;
//public class FrequencyOfCharacters {
//
//	public static void main(String[] args) {
//		String str="character";
//		HashMap<Character,Integer>map=new HashMap<>();
//		for(char ch:str.toCharArray())
//		{
//			map.put(ch,map.getOrDefault(ch,0)+1);
//		}
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//		
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}//a->2,r->2,c->2,t->1,e->1,h->1
//
//	}
//
//}
//or
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "programming";
        int[] frq = new int[26];

        for (char ch : str.toCharArray()) {
            System.out.println(ch);
            frq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (frq[i] > 0) {
                System.out.println((char)(i + 'a') + "=" + frq[i]);
            }//a=1,g=2,i=1,m=2,n=1,o=1,p=1,r=2
        }
    }
}