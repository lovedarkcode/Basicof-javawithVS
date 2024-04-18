
class A {
    void print() {
        System.out.println("This is A class");
    }

}

class B extends A {
    void show() {
        System.out.println("This is second class");
    }

}

class C extends B {
    void run() {
        System.out.println("This is C class");
    }

}

public class multilevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }

}
