class Animal {
    public void speak() {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal {
    public void speak() {
        System.out.println("Woff!");
    }

}

class Cat extends Animal {
    public void speak() {
        System.out.println("Meooww");
    }

}

public class dynamicpoly {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.speak();
        animal2.speak();
    }

}
