public class overloading {
    static void print(int a, int b) {
        System.out.println("the number is:" + a + "&" + b);
    }

    static void print(int c, double d) {
        System.out.println("the number are;" + c + "&" + d);
    }

    static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        print(4, 9);
        print(6, 8.9);
        print("Hello  World");

    }

}
