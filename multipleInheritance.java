
interface BMW {
    void print();

}

interface Maruti {
    void run();

}

interface Hyundai {
    void show();

}

class Car implements BMW, Maruti, Hyundai {

    public void show() {
        System.out.println("I am a Hyundai");

    }

    public void run() {
        System.out.println("I am a maruti.");
    }

    public void print() {
        System.out.println("This is Bmw car");

    }

}

public class multipleInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.show();
        c2.run();
        c3.print();
    }

}
