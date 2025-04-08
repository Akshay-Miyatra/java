package java_assignment2;
abstract class Shape1 {
    abstract double calculateArea(); 
    abstract double calculatePerimeter(); 
}
class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle2 extends Shape1 {
    private double length;
    private double width;
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class program18 {
    public static void main(String[] args) {
        Shape1 circle = new Circle1(5.0); 
        Shape1 rectangle = new Rectangle2(4.0, 6.0); 
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
