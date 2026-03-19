
package Mainjava;
import java.util.Arrays;
public class Question11 {

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

