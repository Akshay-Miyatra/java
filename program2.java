
package java_assignment2;

class Student {
    String name;
    int age;
    char gender;
    
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'M';
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'M'; 
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

    }
}

public class program2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
        Student s3 = new Student("Bob", 22, 'F');

        s1.display();
        s2.display();
        s3.display();
    }
}
