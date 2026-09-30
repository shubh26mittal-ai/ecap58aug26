package basiccs;
public class MinLengthSubArray {

    public static int minLenSubArray(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);  // fixed variable name
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;  // fixed condition
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minLength = minLenSubArray(arr, target);
        System.out.println(minLength);//2
    }
}


