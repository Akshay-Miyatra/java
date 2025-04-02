package java_assignment2;
class Rectangle {
    private double length;
    private double width;

    public void setValues(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
}
    
public class program1 {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        rect.setValues(5.0, 10.0);
        System.out.println("Area of the rectangle: " + rect.area());
    }
}
