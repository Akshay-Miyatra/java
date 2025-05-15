/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

class Student{
    String fname,lname;

    public Student(String fname,String lname) {
        this.fname =fname;
        this.lname = lname;
    }
    
}
class College1 extends Student{
   String stream;
    public College1(String fname,String lanme,String stream) {
          super(fname,lanme);
          this.stream = stream;
    }
    void display(){
        System.out.println("Name is : "+fname+" "+lname);
        System.out.println("Stream is :" +stream);
    }
    
}


public class superkeyword_inheritance {
    public static void main(String[] args) {
      College1 c = new College1("miyatra","akshay","mca");
      c.display();
        
    }
}
