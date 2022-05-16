package inheritance;

public class Hierarchical {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Hierarchical {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Hierarchical {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        System.out.println(">>>>>>>>>>");
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}