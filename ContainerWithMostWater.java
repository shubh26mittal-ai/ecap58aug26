package basiccs;
public class ContainerWithMostWater {
	public static int maxArea(int[] trap)
	{
		int left = 0;
		
		int right = trap.length-1;
		
		int maxArea = 0;
		
		while(left < right)
		{
			int width = right - left;
			int currentArea = width * Math.min(trap[left], trap[right]);
			
			maxArea = Math.max(maxArea, currentArea);
			
			if(trap[left] < trap[right])
			{
				left++;
			}else {
				right--;
			}
		}
		
		return maxArea;
	}

	public static void main(String[] args) {
		
		int[] trap ={1,8,6,2,5,4,8,3,7};
		
		int maxWater = maxArea(trap);
		System.out.println(maxWater);//49

	}

}
