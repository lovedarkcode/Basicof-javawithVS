import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {

        // reverse a array
        // int[] num = { 12, 13, 14, 15, 16, 17, 18, 19 };

        // for (int i = num.length - 1; i >= 0; i--) {
        // System.out.print(num[i] + " ");
        // }

        // finding the maximum number

        int[] number = { 12, 16, 33, 56, 78, 90, 2, 9, 6, 4 };
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.print("Maximum number is =" + max);

        // Sorting a array

        int[] arr = { 2, 5, 1, 10, 4, 6, 1, 20 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + ", ");
        }
        // Print the last element without a comma
        System.out.print(arr[arr.length - 1]);

    }

}
