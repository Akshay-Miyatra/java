/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

class Person
{

    public Person() {
        System.out.println("Person class call");
    }
    
}
class Employee extends Person{

    public Employee() {
        System.out.println("Class Employee call");
    }
    
}
public class constructor_inheritance {
    public static void main(String[] args) {
        Employee e = new Employee();
        
    }
    
}
