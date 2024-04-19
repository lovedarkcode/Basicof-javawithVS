
class A {
    void one() {
        System.out.println("This is A");
    }

}

class B extends A {
    void two() {
        System.out.println("This is B");
    }

}

class C extends B {
    void three() {
        System.out.println("This is three");
    }

}

class D extends B {
    void four() {
        System.out.println("This is four");
    }

}

public class hybrid {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        b.one();
        c.two();
        d.two();
    }
}
