package University;

import java.util.ArrayList;
import java.util.List;
public class UniversitySystem {
    private final List<Course> courses;
    private final List<Student> students;

    public UniversitySystem(){
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void enrollStudents(){
        for(Student student: students){
            String studentName = student.getName();
            for(Course course:courses){
                if(student.enrollInCourse(course)){
                    System.out.println(studentName + " enrolled in " + course.getCourseName());
                }else{
                    System.out.println(studentName + " could not enroll in  " + course.getCourseName());
                }
            }
        }
    }

    public static void main(String[] args) {
        UniversitySystem universitySystem = new UniversitySystem();
        universitySystem.addCourse(new Course("Mathematics","MATH101", 2));
        universitySystem.addCourse(new Course("Physics", "PHY101", 3));
        universitySystem.addCourse(new Course("Chemistry", "CHEM101", 2));

        universitySystem.addStudent(new Student("Alice", "S001"));
        universitySystem.addStudent(new Student("Bob", "S002"));
        universitySystem.addStudent(new Student("Charlie", "S003"));

        universitySystem.enrollStudents();
    }

}
