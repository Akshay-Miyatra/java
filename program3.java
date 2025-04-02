package java_assignment2;

class Triangle {
    float base;
    double height;
    double a;

    
    public Triangle() {
        this.base = 12;
        this.height = 13.3;
    }

  
    public Triangle(float base, double height) {
        this.base = base;
        this.height = height;
    }

   
    public void calcArea() {
        a = 0.5 * (base * height); 
        System.out.println("Area of triangle = " + a);
    }
}

public class program3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(13, 14.5);
        Triangle t3 = new Triangle(45, 90.0);

        t1.calcArea();
        t2.calcArea();
        t3.calcArea();
    }
}
