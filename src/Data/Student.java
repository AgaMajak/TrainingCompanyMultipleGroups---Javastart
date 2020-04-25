package Data;

public class Student extends Person {
    protected double monthlyCharge;


    public Student(String firstName, String lastName, int phoneNumber, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.monthlyCharge = monthlyCharge;
    }
}
