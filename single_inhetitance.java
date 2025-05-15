/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

class A{
    public void methodA(){
    
        System.out.println("Base class");
   }
}
class B extends A{
    public void methodB(){
        System.out.println("Chield class");
    }
}
public class single_inhetitance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.methodA();
        b1.methodB();
    }
    
}
