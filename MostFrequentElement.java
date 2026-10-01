package frequencymap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {
		int[]arr= {10,20,10,30,20,10,40};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		int maxFrequency=0;
		int result = 0;
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>maxFrequency)
			{
				maxFrequency=entry.getValue();
				result=entry.getKey();
			}
		}
		System.out.println("Mostfrequentelementis:"+result);//Mostfrequentelementis:10
		System.out.println("Frequencyof"+result+"is"+maxFrequency);//Frequencyof10is3

	}

}
