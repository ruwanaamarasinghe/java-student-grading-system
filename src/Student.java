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
}
