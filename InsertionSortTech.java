package sorting;
import java.util.Arrays;

public class InsertionSortTech {

	public static void main(String[] args) {
		int[] arr = {5, 3 ,4 ,6,1, 2};
		
		for(int i=1 ; i<arr.length;i++)
		{
			int n = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]> n)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = n;
		}
		
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]

	}

}
