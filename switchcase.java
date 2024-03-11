import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        System.out.println("1. Pink");
        System.out.println("2. red");
        System.out.println("3. yellow");
        System.out.println("4. Blue");
        System.out.println("5. Orange");

        System.out.print("Enter the number of your favorite color= ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("color is pink");
                break;
            case 2:
                System.out.println("color is red");
                break;
            case 3:
                System.out.println("color is yellow");
                break;
            case 4:
                System.out.println("color is blue");
                break;
            case 5:
                System.out.println("color is orange");
                break;
            default:
                System.out.println("Please enter a valid choice");
                break;

        }

    }

}
