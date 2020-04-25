package Data;

public class MathGroup extends TrainingGroup {
    protected String subject;

    public MathGroup(Student[] students, Teacher[] teachers, String subject) {
        super(students, teachers);
        this.subject = subject;
    }

    public void showGroupInfo() {
        System.out.println("Nazwa grupy: " + subject);
        for (Teacher teacher : teachers) {
            System.out.printf("Nauczyciel - %s %s, tel.: %d; Nauczane przedmioty: %s; Wypłata: %.2fzł\n", teacher.getFirstName(), teacher.getLastName(), teacher.getPhoneNumber(), teacher.teachingSubject, teacher.salary);
        }
        System.out.println("Studenci w grupie:");
        for (Student student : students) {
            System.out.printf("- %s %s, tel.: %d; Czesne: %.2fzł\n", student.getFirstName(), student.getLastName(), student.getPhoneNumber(), student.monthlyCharge);
        }
        System.out.println();
    }

}
