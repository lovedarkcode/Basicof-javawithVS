public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int secound = 1;
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(first + " ");
        // int next = first + secound;
        // first = secound;
        // secound = next;
        // i++;
        // }

        // using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(first + " ");
            int next = first + secound;
            first = secound;
            secound = next;
        }

    }
}
