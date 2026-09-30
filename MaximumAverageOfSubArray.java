package basiccs;
public class MaximumAverageOfSubArray {

    public static double findMaxAvg(int[] arr, int k) {
        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;   // initialize with the first window's sum

        // slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];        // add the new element entering the window
            windowSum -= arr[i - k];    // remove the old element leaving the window
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findMaxAvg(arr, k);
        System.out.println(result); //12.75
    }
}


