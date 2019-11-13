package nuigalway.app;

import org.joda.time.DateTime;

public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;

    public Student(String name, int age, String dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername(){
        return getName() + getAge();
    }
}
