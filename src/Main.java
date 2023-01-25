import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    }

    public static int[] twoSum(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            int first = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int second = input[j];
                int total = first + second;
                if (total == target) {
                    return new int[]{i + 1, j + 1};
                }
            }


        }
        return null;
    }
}












































