
public class exceptionHandeling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result=" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: divided by zero");

        } finally {
            // code that will always be execute weather the exception occured or not
            System.out.println("This will always be executed");
        }
    }

}
