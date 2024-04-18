
class First {
    void print() {
        System.out.println("This is class first");
    }

}

class Second extends First {
    void show() {
        System.out.println("This is second class");
    }

}

public class singleInheritance {
    public static void main(String[] args) {
        Second sc = new Second();
        sc.print();
        sc.show();
    }

}
