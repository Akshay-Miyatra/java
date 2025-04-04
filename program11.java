
class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}


class Student extends Human {
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}


class Worker extends Human {
    private double weekSalary;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double moneyPerHour() {
        return weekSalary / (workHoursPerDay * 7); // Assuming a 7-day workweek
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Week Salary: $" + weekSalary);
        System.out.println("Work Hours per Day: " + workHoursPerDay);
        System.out.println("Money per Hour: $" + moneyPerHour());
    }
}


public class program11 {
    public static void main(String[] args) {
        Student student = new Student("abc", "xyz", 10);
        Worker worker = new Worker("rathod", "mihir", 700, 8);

        System.out.println("Student Details:");
        student.displayInfo();

        System.out.println("\nWorker Details:");
        worker.displayInfo();
    }
}
