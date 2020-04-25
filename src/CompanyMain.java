import Data.EnglishGroup;
import Data.MathGroup;
import Data.Student;
import Data.Teacher;

public class CompanyMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Zofia", "Nowak", 555444666, 400.0),
                new Student("Adam", "Kowalski", 444333111, 450.0),
                new Student("Anna", "Rybak", 222333444, 500.0),
                new Student("Marek", "Lewandowski", 666777888, 420.0)
        };

        Teacher[] teachers = {
                new Teacher("Janina", "Malinowska", 666777888, "Angielski", 3000.0),
                new Teacher("Arnold", "Bocian", 555444999, "Matematyka", 3200.0)
        };

        Student[] englishStudents = {
                students[0],
                students[1]
        };
        Teacher[] englishTeachers = {
                teachers[0]
        };

        Student[] mathStudents = {
                students[0],
                students[2]
        };
        Teacher[] mathTeacher = {
                teachers[1]
        };

        EnglishGroup englishGroup = new EnglishGroup(englishStudents, englishTeachers, "Angielski");
        englishGroup.showGroupInfo();

        MathGroup mathGroup = new MathGroup(mathStudents, mathTeacher, "Matematyka");
        mathGroup.showGroupInfo();

        String[][] mathGrades = new String[2][5];
        String[][] englishGrades = new String[2][5];


    }
}
