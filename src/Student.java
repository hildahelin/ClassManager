import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {

    private String studentNumber;
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, Integer> grades = new HashMap<>();

    public Student(int id, String name, String email, String studentNumber) {
        super(id, name, email);
        this.studentNumber = studentNumber;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void addGrade(Course course, int grade) {
        grades.put(course, grade);
    }

    public void showGrades() {
        System.out.println(getName() + "'s Grades:");
        for (Map.Entry<Course, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey().getTitle() + ": " + entry.getValue());
        }
    }
}
