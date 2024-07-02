package University;

public class Course {
    private final String courseName;
    private final String courseCode;
    private final int maxStudents;
    private int enrolledStudents;

    public Course(String courseName, String courseCode, int maxStudents){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.maxStudents = maxStudents;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(){
        if(enrolledStudents<maxStudents){
            enrolledStudents++;
            return true;
        } else{
            return false;
        }
    }


    @Override
    public String toString() {
        return courseCode + ": " + courseName + " (Enrolled: " + enrolledStudents + "/" + maxStudents + ")";
    }
}
