import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            marks.add(scanner.nextInt());
        }

        Student student = new Student(id, name, marks);
        studentsList.add(student);

        System.out.print("Student added successfully!\n");
    }

    public void showAllStudents() {
        if (studentsList.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : studentsList) {
            student.displayInfo();
            System.out.println("...............");
        }
    }
}
