/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Dell
 */
class Bank{
    int get()
    {
        return 5;
    }
}
class Bob extends Bank{
    int get()
    {
        return 10;
    }
}
class Sbi extends Bank
{
    int get()
    {
        return 20;
    }
}
public class method_overrding {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Bank b = new Bank();
        Bob b1 = new Bob();
        
        System.out.println("Rate of bank is "+b.get());
                
    }
    
}
