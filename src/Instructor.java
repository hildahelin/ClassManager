import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {

    private List<Course> teachingCourses = new ArrayList<>();

    public Instructor(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

    public void addCourse(Course course) {
        teachingCourses.add(course);
    }

    public void assignGrade(Student student, Course course, int grade) {
        student.addGrade(course, grade);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }
}
