
package java_assignment2;

class University1 {
    String uname;
    String ucity;
    int tot_stud;


    University1(String uname, String ucity, int tot_stud) {
        this.uname = uname;
        this.ucity = ucity;
        this.tot_stud = tot_stud;
    }
}
class Department1 extends University1 {
    int deptno;
    String deptname;

 
    Department1(String uname, String ucity, int tot_stud, int deptno, String deptname) {
 
        super(uname, ucity, tot_stud);
        this.deptno = deptno;
        this.deptname = deptname;
    }


    void display() {
        System.out.println("University Name: " + uname);
        System.out.println("University City: " + ucity);
        System.out.println("Total Students: " + tot_stud);
        System.out.println("Department Number: " + deptno);
        System.out.println("Department Name: " + deptname);
        System.out.println("");
    }
}
public class program5 {
     public static void main(String[] args) {
        Department1 d1 = new Department1("Atmiya University ", "Rajkot", 200, 101, "Computer Science");
        d1.display();

        Department1 d2 = new Department1(" University", "Stanford", 16000, 102, "Mechanical Engineering");
        d2.display();
    }
}
