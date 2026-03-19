//Move all zeroes to the end
package Mainjava;

public class Question5 {
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }
        while (index < n) {
            temp[index++] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
