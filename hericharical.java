class A {
    void print() {
        System.out.println("This is first class");
    }

}

class B extends A {
    void show() {
        System.out.println("This is second class");
    }

}

class C extends A {
    void run() {
        System.out.println("This is third class");
    }

}

public class hericharical {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        c.print();
        b.print();

    }
}
