
import java.util.Scanner;

public class chatprocess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to ChatBot. Type 'exit' to end the conversation.");

        while (true) {
            System.out.print("You:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            } else if (userInput.equalsIgnoreCase("hello")) {
                System.out.println("ChatBot: hello how may I help you");
            } else if (userInput.equalsIgnoreCase("how are you")) {
                System.out.println("ChatBot: Sorry I am Bot I don't have feelings");
            } else {
                System.out.println("I am sorry I didn't understand that");
            }

        }
    }

}
