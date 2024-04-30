package exceptionHandeling;

public class uncheckexception {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result=" + result);
        } catch (ArithmeticException e) {
            System.out.println(e);

        } finally {
            System.out.println("This will execute every-time");
        }
    }

}
