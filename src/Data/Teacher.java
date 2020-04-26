package Data;

public class Teacher extends Person {
    String teachingSubject;
    double salary;

    public Teacher(String firstName, String lastName, int phoneNumber, String teachingSubject, double salary) {
        super(firstName, lastName, phoneNumber);
        this.teachingSubject = teachingSubject;
        this.salary = salary;
    }
}
