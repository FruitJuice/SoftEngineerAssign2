package nuigalway.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void studentIsValid()
    {
        Student student1 = new Student("Mark Higgan", 18, "12/11/2002", 1);
        assertEquals("Username is Wrong", "Mark Higgan18", student1.getUsername());
        assertEquals("ID is Wrong", 1, student1.getId());
        assertEquals("Name is Wrong", "Mark Higgan", student1.getName());
        assertEquals("DOB is Wrong", "12/11/2002", student1.getDob());
    }

    @Test
    public void moduleIsValid()
    {
        Student student1 = new Student("Mark Higgan", 18, "12/11/2002", 1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);


        Module mod1 = new Module("Human Interaction", "CT112", students);

        assertEquals("Modulename is Wrong", "Human Interaction", mod1.getModuleName());
        assertEquals("ID is Wrong", "CT112", mod1.getId());
        assertNotNull("Students are missing", mod1.getStudents());
    }

    @Test
    public void programmeIsValid()
    {
        Student student1 = new Student("Mark Higgan", 18, "12/11/2002", 1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        Module mod1 = new Module("Human Interaction", "CT112", students);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(mod1);

        DateTime start = new DateTime("2019-01-01T08:00:00.0-08:00");
        DateTime end = new DateTime("2019-10-15T18:00:00.0-08:00");
        Programme year = new Programme("Psych", modules, students, start, end);

        assertEquals("CourseName is Wrong", "Psych", year.getCourseName());
        assertNotNull("Modules are missing", year.getModules());
        assertNotNull("Students are missing", year.getStudents());
        assertNotNull("Start Date is missing", year.getCourseStart());
        assertNotNull("End Date is missing", year.getCourseEnd());
    }
}
