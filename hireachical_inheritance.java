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
class Animal1{
    void eatfood()
    {
        System.out.println("This animal eat food");
    }
   
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Sound of dog bark");
    }
            
}
class Cat1 extends Animal1{
    void catbark()
    {
        System.out.println("miiiou");
    }
}
public class hireachical_inheritance {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.bark();
        d1.eatfood();
        
        Cat1 c1 = new Cat1();
        c1.catbark();
        c1.eatfood();
               
    }
}
