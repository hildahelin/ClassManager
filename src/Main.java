public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(1, "Helin Hilda", "helinhilda@gmail.com");
        Course javaCourse = new Course(101, "Java Programming", instructor);
        instructor.addCourse(javaCourse);

        Student student1 = new Student(2, "Pelin Aydın", "pelinaydin@gmail.com", "1905");
        student1.enrollInCourse(javaCourse);
        Student student2 = new Student(1, "Canan Köse", "canankose@gmail.com", "1903");
        student2.enrollInCourse(javaCourse);

        instructor.assignGrade(student1, javaCourse, 95);
        instructor.assignGrade(student2, javaCourse, 60);

        System.out.println(student1.getName() + " has enrolled in " + javaCourse.getTitle() + ".");
        student1.showGrades();
        System.out.println(student2.getName() + " has enrolled in " + javaCourse.getTitle() + ".");
        student2.showGrades();
    }
}
