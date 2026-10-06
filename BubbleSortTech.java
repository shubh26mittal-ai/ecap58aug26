package sorting;
import java.util.Arrays;

public class BubbleSortTech {

	public static void main(String[] args) {
		int[] arr = {5 , 3, 4 ,1};
		System.out.println(Arrays.toString(arr));//[5, 3, 4, 1]
		
		for(int i=0; i<arr.length;i++)
		{
			boolean isSwapped = false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
					
					isSwapped = true;
				}
			}
			if(!isSwapped)
			{
				break;
			}else {
				System.out.println(Arrays.toString(arr));
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));

	}//[5, 3, 4, 1],[1, 5, 4, 3],[1, 3, 5, 4],[1, 3, 4, 5],[1, 3, 4, 5]

}
