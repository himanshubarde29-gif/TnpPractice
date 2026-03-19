//Maximum subarray
package Mainjava;
public class Question7 {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubarraySum(arr);
        System.out.println(result);
    }
}