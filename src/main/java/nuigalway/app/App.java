package nuigalway.app;


import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Create students
        Student student1 = new Student("Mark Higgan", 18, "12/11/2002", 1);
        Student student2 = new Student("Joanne Kelly", 20, "09/7/2001",2);

        //Add students to list
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        //Create modules with students
        ArrayList<Module> modules = new ArrayList<>();
        Module mod1 = new Module("Human Interaction", "CT112", students);
        Module mod2 = new Module("Law", "CT198", students);
        modules.add(mod1);
        modules.add(mod2);


        //Create date objects
        DateTime start = new DateTime("2019-01-01T08:00:00.0-08:00");
        DateTime end = new DateTime("2019-10-15T18:00:00.0-08:00");

        Programme year = new Programme("Psych", modules, students, start, end);
    }

}
