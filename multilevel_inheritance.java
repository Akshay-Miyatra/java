/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

class X{
    public void X(){
        System.out.println("Class X call");
        
    }
}
class Y extends X{
    public void Y(){
        System.out.println("Class y call");
    }
}
class Z extends Y{
     public void Z(){
         System.out.println("Class Z call");
     }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        Z z1 = new Z();
        z1.X();
        z1.Y();
        z1.Z();
    }
    
}
