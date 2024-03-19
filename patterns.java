public class patterns {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++)

        // {
        // for (int j = 1; j <= 5; j++)

        // {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}