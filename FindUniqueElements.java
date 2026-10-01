package frequencymap;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElements {

	public static void main(String[] args) {
		int[]arr= {10,20,10,30,20,10,40};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());//40,30
			}
		}

	}

}
