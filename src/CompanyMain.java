import Data.Student;
import Data.Teacher;
import Data.TrainingGroup;

public class CompanyMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Zofia", "Nowak", 555444666, "Angielski", 400.0),
                new Student("Adam", "Kowalski", 444333111, "Angielski", 450.0)
        };

        Teacher teacher = new Teacher("Janina", "Malinowska", 666777888, "Angielski", 3000.0);

        TrainingGroup english = new TrainingGroup("Angielski", teacher, students);

        english.showGroupInfo();


    }
}
