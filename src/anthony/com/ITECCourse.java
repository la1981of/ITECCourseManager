package anthony.com;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kaba on 3/3/16.
 */
public class ITECCourse {
        String name;
        int code;
        ArrayList<String> students;
        int maxStudents;

//Constructor
        ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
            this.name = courseName;
            this.code = courseCode;

            this.students = new ArrayList<String>();
            this.maxStudents = courseMaxStudents;
        }
    void addStudent(String studentName) {
//don't need to check if students ArrayList is null –
//we know that the constructor set it up
        students.add(studentName);
    }
    //Other methods follow...
    public class ITECCourseManager {

        public  void main(String args[]) throws IOException{

            ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

//Add some students
            maintenanceCourse.addStudent("Anna");
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");

            maintenanceCourse.writeCourseInfo();

            ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

//Add some students
            datacomCourse.addStudent("Anthony");
            datacomCourse.addStudent("James");
            datacomCourse.addStudent("Christiana");

            datacomCourse.writeCourseInfo();

        }


    }

    private void writeCourseInfo() {
    }
}
