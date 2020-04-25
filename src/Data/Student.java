package Data;

public class Student extends Person {
    protected String attendedClasses;
    protected double monthlyCharge;

    public Student(String firstName, String lastName, int phoneNumber, String attendedClasses, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.attendedClasses = attendedClasses;
        this.monthlyCharge = monthlyCharge;
    }
}
