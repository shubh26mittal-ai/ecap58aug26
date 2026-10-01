package stringsdsa;
import java.util.Arrays;
import java.util.HashMap;

//public class FirstNonRepeatCharacter {
//
//	public static void main(String[] args) {
//		String str="swiss";
//		char[]res=str.toCharArray();
//		System.out.println(Arrays.toString(res));//[s, w, i, s, s]
//		HashMap<Character,Integer>map=new HashMap<>();//3
//		for(char ch:str.toCharArray())//1
//		{
//			map.put(ch,map.getOrDefault(ch,0)+1);
//		}
//		for(char ch:str.toCharArray())
//		{
//			System.out.println(map.get(ch));//FirstNonRepeatCharacter:w,1
//			if(map.get(ch)==1)
//			{
//				System.out.println("FirstNonRepeatCharacter:"+ch);//FirstNonRepeatCharacter:i,3,3
//			}
//		}
//
//	}
//
//}
//or
public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        int[] frq = new int[26];

        for (char ch : str.toCharArray()) {
            frq[ch - 'a']++;
        }

        for (char ch : str.toCharArray()) {
            if (frq[ch - 'a'] == 1) {
                System.out.println(ch);//w
                break;
            }
        }
    }
}