package Data;

public class TrainingGroup {
    protected String subject;
    protected Teacher teacher;
    protected Student[] students;

    public TrainingGroup(String subject, Teacher teacher, Student[] students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    public void showGroupInfo() {
        System.out.println("Nazwa grupy: " + subject);
        System.out.printf("Nauczyciel - %s %s, tel.: %d; Nauczane przedmioty: %s; Wypłata: %.2fzł\n\n", teacher.getFirstName(), teacher.getLastName(), teacher.getPhoneNumber(), teacher.teachingSubject, teacher.salary);
        System.out.println("Studenci w grupie:");
        for (Student student : students) {
            System.out.printf("- %s %s, tel.: %d; Grupy: %s; Czesne: %.2fzł\n", student.getFirstName(), student.getLastName(), student.getPhoneNumber(), student.attendedClasses, student.monthlyCharge);
        }
    }
}

