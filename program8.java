/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment2;
import MathPack.MathDemo;
public class program8 {
    public static void main(String[] args) {
        // Create an object of MathDemo
        MathDemo math = new MathDemo();

        // Call the add() method and print the result
        int sum = math.add(5, 3);
        System.out.println("Addition: " + sum);

        // Call the sub() method and print the result
        int difference = math.sub(5, 3);
        System.out.println("Subtraction: " + difference);
    }
}
