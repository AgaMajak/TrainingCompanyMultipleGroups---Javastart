package Data;

public class Student extends Person {
    protected double monthlyCharge;
    protected Integer[] grades;

    public Student(String firstName, String lastName, int phoneNumber, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.monthlyCharge = monthlyCharge;
    }

    public void showGrades(TrainingGroup trainingGroup, int studentIndex) {
        System.out.println("Ocena studenta " + trainingGroup.students[studentIndex].getFirstName() + " " + trainingGroup.students[studentIndex].getLastName() + " z kursu: " + trainingGroup.subject + " to: " + trainingGroup.students[studentIndex].grades[0]);
    }


}
