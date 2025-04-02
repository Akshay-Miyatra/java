
package java_assignment2;

// Abstract class Shape
abstract class Shape {
    // Abstract method draw() to be implemented by subclasses
    abstract void draw();
}

// Rectangle class extending Shape
class Rectangle1 extends Shape {
    // Implementing draw() method
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
class Circle extends Shape {
    // Implementing draw() method
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}
public class program6 {
     public static void main(String[] args) {
        // Shape reference pointing to Rectangle object
        Shape shapeRef;

        shapeRef = new Rectangle1(); // Creating instance of Rectangle
        shapeRef.draw(); // Calls Rectangle's draw()

        shapeRef = new Circle(); // Creating instance of Circle
        shapeRef.draw(); // Calls Circle's draw()
    }
}
