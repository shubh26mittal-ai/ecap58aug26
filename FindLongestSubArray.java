package basiccs;
public class FindLongestSubArray {

    public static int longestSubArray(int[] arr, int k) {
        // 2 pointer concept
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 0, 1, 1, 0};
        int k = 4;
        int result = longestSubArray(arr, k);   // lowercase "l" — matches the method name
        System.out.println(result); //5
    }
}


