/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

class Student1{
    String fname1,lname1;
    public Student1(String fname1,String lname1){
        this.fname1 = fname1;
        this.lname1 = lname1;
    
}
}
class College2 extends Student1{
        String stream;
        public College2(String fname1,String lname1,String stream ) {
            super(fname1, lname1);
            this.stream = stream;
        }
        void display()
        {
            System.out.println("name is "+fname1+""+lname1);
            System.out.println("stream is "+stream);
        }
    
}

public class super2 {
    public static void main(String[] args) {
          College2 c2 = new College2("akshay", "miyatra", "mca");
          c2.display();
  
    }
}
