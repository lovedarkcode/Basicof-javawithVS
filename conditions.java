import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        int num1 = 20;

        if (num1 > 10 && num1 < 30) {
            System.out.println(num1);

        } else {
            System.out.println("End");
        }

        int number1, number2;
        System.out.println("Enter the first number=");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("Enter the second number=");
        Scanner sc1 = new Scanner(System.in);
        number2 = sc1.nextInt();

        if (number1 > number2) {
            System.out.print("number1 is Greater");
        } else {
            System.out.print("number2 is Greater");
        }

        int num1, num2, num3;
        System.out.print("Enter the first number= ");
        Scanner sc2 = new Scanner(System.in);
        num1 = sc2.nextInt();
        System.out.print("Enter the Second number= ");
        Scanner sc3 = new Scanner(System.in);
        num2 = sc3.nextInt();
        System.out.print("Enter the third number= ");
        Scanner sc4 = new Scanner(System.in);
        num3 = sc4.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number1 is Greater");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("number 2 is greater");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3 is Greater");

        } else {
            System.out.println("Doesnt satisfy any condition");
        }

    }

}
