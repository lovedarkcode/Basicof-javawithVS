import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // Using integer method

        int[] num = new int[5];
        num[0] = 100;
        num[1] = 200;
        num[2] = 300;
        num[3] = 400;
        num[4] = 500;

        System.out.println(num[1]);

        // using string method

        String[] words = { "hello", "world" };

        System.out.println(Arrays.toString(words));

    }

}
