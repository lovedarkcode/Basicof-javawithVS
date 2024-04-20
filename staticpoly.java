public class staticpoly {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        staticpoly Poly = new staticpoly();
        System.out.println(Poly.add(8, 9));
        System.out.println(Poly.add(5.6, 6.8));
        System.out.println(Poly.add("Hello", "World"));
    }

}
