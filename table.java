import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        // int i = 1;
        System.out.print("Enter any number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // while (i <= 10) {
        // System.out.println(i + " X" + num + "=" + (i * num));
        // i++;
        // }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "X" + num + "=" + (i * num));
        }

    }

}
