
package Mainjava;

public class Question12 {
    public static int trap(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            int min = Math.min(leftMax, rightMax) - arr[i];
            total += min;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] height = {3,0,2,0,4};
        System.out.println(trap(height));
    }
}