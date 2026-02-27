// Write a program to demonstrate polymorphism using method overriding with a base
// class Shape and derived classes Circle and Rectangle.

package MODULE_3;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();
         
        s = new Rectangle();
        s.draw();
    }
}
