
package java_assigmnet2;
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency() {
        return 0; 
    }

    double calculateDistanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    int getMaxSpeed() {
        return 0; 
    }

    void displayInfo() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }
}


class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 5; 
    }

    @Override
    int getMaxSpeed() {
        return 120;
    }
}


class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15;
    }

    @Override
    int getMaxSpeed() {
        return 180;
    }
}


class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 30;
    }

    @Override
    int getMaxSpeed() {
        return 160;
    }
}
public class program12 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2022, "Petrol");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 10L: " + car.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

        Vehicle truck = new Truck("Volvo", "FH16", 2021, "Diesel");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 10L: " + truck.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        Vehicle bike = new Motorcycle("Yamaha", "R15", 2023, "Petrol");
        bike.displayInfo();
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 10L: " + bike.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + bike.getMaxSpeed() + " km/h");
    }
}
