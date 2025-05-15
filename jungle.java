/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

// First interface
interface Animal {
    void makeSound();
}

// Second interface
interface Walkable {
    void walk();
}

// Class implementing multiple interfaces
class Dog implements Animal, Walkable {
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void walk() {
        System.out.println("The dog walks on four legs");
    }
}

public class jungle {
     public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.walk();
    }
}
