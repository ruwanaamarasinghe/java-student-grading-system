import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private List<Integer> marks;

    public Student(int studentId, String name, List<Integer> marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getMarks() {
        return marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return marks.size() > 0 ? sum / marks.size() : 0.0;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        return GradeCalculator.getGrade(average);
    }
}
