//this program amde with single inheritance
package java_assignment2;
class University {
    String uname;
    String ucity;
    int tot_stud;


    void getUniv(String uname, String ucity, int tot_stud) {
        this.uname = uname;
        this.ucity = ucity;
        this.tot_stud = tot_stud;
    }
}

class Department extends University {
    int deptno;
    String deptname;

   
    void getDept(int deptno, String deptname) {
        this.deptno = deptno;
        this.deptname = deptname;
    }
    void display() {
        System.out.println("University Name: " + uname);
        System.out.println("University City: " + ucity);
        System.out.println("Total Students: " + tot_stud);
        System.out.println("Department Number: " + deptno);
        System.out.println("Department Name: " + deptname);
 
    }
}

public class program4 {
    public static void main(String[] args) {
    
        Department d1 = new Department();
        d1.getUniv("Atmiya University", "Rajkot", 120);
        d1.getDept(101, "Computer Science");
        d1.display();


        Department d2 = new Department();
        d2.getUniv("Saurastra University", "Rajkot", 16000);
        d2.getDept(102, "Engineering");
        d2.display();
    }
}
