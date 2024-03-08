public class swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // System.out.println("Before swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // // Swapping logic
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("\nAfter swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // Without using third vriable

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

    }
}
