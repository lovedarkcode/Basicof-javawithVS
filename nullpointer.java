package exceptionHandeling;

public class nullpointer {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the string:" + length);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("This will execute every-time");
        }
    }

}
