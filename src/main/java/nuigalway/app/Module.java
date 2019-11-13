package nuigalway.app;
import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String id;
    private ArrayList<Student> students;

    public Module(String moduleName, String id, ArrayList students){
        this.moduleName = moduleName;
        this.id = id;
        this.students = students;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
