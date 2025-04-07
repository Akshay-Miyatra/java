/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assigmnet2;

class MathUtils {
    final int square(int number) {
        return number * number;
    }
}

class AdvancedMath extends MathUtils {
    int square(int number) { // ❌ This line causes an error
        return number * number * number;
    }
}
public class program16 {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("Square of 4: " + math.square(4));
    }
}
