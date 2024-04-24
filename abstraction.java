
abstract class Shape {
    public abstract void draw();

}

class Reactange extends Shape {

    @Override
    public void draw() {
        System.out.println("This is a Reactange");

    }

}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("This is a Circle");

    }

}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("This is a triange");

    }

}

public class abstraction {
    public static void main(String[] args) {
        Shape s1 = new Reactange();
        Shape s2 = new Circle();
        Shape s3 = new Triangle();
        s1.draw();
        s2.draw();
        s3.draw();

    }
}