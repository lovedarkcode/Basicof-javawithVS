public class removeduplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 22, 3, 4, 5, 6, 6, 7, 7, 7, 8 };
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];

        System.out.println("Unique elements:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
