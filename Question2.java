package Mainjava;
import java.util.HashSet;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            if (set.contains(num)) {
                System.out.println(num);
            }
            set.add(num);
        }
    }

    }

