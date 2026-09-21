package p05_inheritance;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();
    }
}
