package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Programme {

    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime courseStart;
    private DateTime courseEnd;

    public Programme(String courseName, ArrayList modules, ArrayList students, DateTime courseStart, DateTime courseEnd){
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.courseStart = courseStart;
        this.courseEnd = courseEnd;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getCourseStart() {
        return courseStart;
    }

    public void setCourseStart(DateTime courseStart) {
        this.courseStart = courseStart;
    }

    public DateTime getCourseEnd() {
        return courseEnd;
    }

    public void setCourseEnd(DateTime courseEnd) {
        this.courseEnd = courseEnd;
    }
}
