//Rotate an array by K positions
package Mainjava;

public class Question4 {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateRight(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

