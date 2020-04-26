package Data;

public class Student extends Person {
    double monthlyCharge;
    Grade[] grades;

    public Student(String firstName, String lastName, int phoneNumber, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.monthlyCharge = monthlyCharge;
    }

    public Student(String firstName, String lastName, int phoneNumber, Grade[] grades) {
        super(firstName, lastName, phoneNumber);
        this.grades = grades;
    }

    public void showGrades(Grade[] grades) {
        System.out.printf("Oceny studenta %s %s to:\n", getFirstName(), getLastName());
        for (Grade grade : grades) {
            System.out.printf("Ocena %.1f z przedmiotu %s\n", grade.grade, grade.trainingGroup.subject);
        }

    }


}
