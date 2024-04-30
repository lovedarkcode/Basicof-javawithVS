package exceptionHandeling;

public class checkexception {
    public static void main(String[] args) {
        try {
            Class.forName("whileClass");
        } catch (ClassNotFoundException e) {
            System.out.println(e);

        } finally {
            System.out.println("This will execute every-time");
        }
    }

}
