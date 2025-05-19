import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to Java based Student Grading System");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.showAllStudents();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice");
            }
        }while (choice != 0);
    }
}
