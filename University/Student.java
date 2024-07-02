package University;

import University.Course;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private final String name;
    private final String studentId;
    private final List<Course> enrolledCourses;

    public Student(String name,String studentId){
        this.name=name;
        this.studentId=studentId;
        this.enrolledCourses=new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    public boolean enrollInCourse(Course course){
        if(course.enrollStudent()){
            enrolledCourses.add(course);
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return studentId + ": " + name;
    }
}
