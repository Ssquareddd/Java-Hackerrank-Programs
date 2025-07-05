import java.util.Arrays;

public class SimpleSwapExample {
    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] arr1 = {1, 2, 3};
        System.out.println("Before swap: " + Arrays.toString(arr1));
        int i = 0, j = 2;
        Integer temp = arr1[i];  // Use Integer instead of T
        arr1[i] = arr1[j];
        arr1[j] = temp;
        System.out.println("After swap: " + Arrays.toString(arr1));

        // Example 2: String array
        String[] arr2 = {"A", "B", "C"};
        System.out.println("Before swap: " + Arrays.toString(arr2));
        i = 0; j = 1;
        String temp2 = arr2[i];
        arr2[i] = arr2[j];
        arr2[j] = temp2;
        System.out.println("After swap: " + Arrays.toString(arr2));
    }
}
