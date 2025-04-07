
package java_assigmnet2;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}


class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name); 
        this.employeeId = employeeId;

       
        System.out.println("Employee Name: " + super.name);
        System.out.println("Employee ID: " + employeeId);
    }
}
public class program17 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101);
    }
}
