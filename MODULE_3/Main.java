// Write a program to demonstrate the difference between method overloading and
// method overriding.

package MODULE_3;

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }

    void speak(String name) {
        System.out.println(name + " barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.speak("Tommy");

        Animal a = new Dog();
        a.speak();
    }
}
