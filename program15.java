
package java_assigmnet2;

class Vehicle1 {
    void startEngine() {
        System.out.println("Starting the engine of the vehicle...");
    }
}

// Subclass - Car
class Car1 extends Vehicle1 {
    void startEngine() {
        System.out.println("Car engine started: Vroom Vroom!");
    }
}

// Subclass - Motorcycle
class Motorcycle1 extends Vehicle1 {
    void startEngine() {
        System.out.println("Motorcycle engine started: Brrrm Brrrm!");
    }
}
public class program15 {
     public static void main(String[] args) {
        Vehicle1 myCar = new Car1();
        Vehicle1 myMotorcycle = new Motorcycle1();

        myCar.startEngine();         
        myMotorcycle.startEngine();  
    }
}
