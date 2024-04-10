import java.util.Scanner;

public class factorial {

    static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined");
        } else {
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

    }
}
