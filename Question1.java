package Mainjava;
import java.util.HashSet;

public class Question1 {
    public static void Missing(int[] arr , int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for (int i = 1; i < n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
         Missing(arr , 6);

    }
}
