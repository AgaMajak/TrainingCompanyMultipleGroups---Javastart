package Data;

public class TrainingGroup {
    protected Student[] students;
    protected Teacher[] teachers;
    protected String subject;

    public TrainingGroup(Student[] students, Teacher[] teachers, String subject) {
        this.students = students;
        this.teachers = teachers;
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

    public void addGrade(int studentIndex, int grade) {
        students[studentIndex].grades = new Integer[1];
        students[studentIndex].grades[0] = grade;
    }

}
