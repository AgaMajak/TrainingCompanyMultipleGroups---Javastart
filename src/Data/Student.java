package Data;

public class Student extends Person {
    double monthlyCharge;
    Grade[] grades;

    public Student(String firstName, String lastName, int phoneNumber, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.monthlyCharge = monthlyCharge;
    }


}
