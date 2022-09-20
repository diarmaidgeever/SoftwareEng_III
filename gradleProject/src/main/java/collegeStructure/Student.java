package collegeStructure;

import org.joda.time.*;

public class Student {
    public static int iDCounter;
    private String name;
    private int age;
    private LocalDate dob;
    private String iD;
    private String username;
    private Module[] modules;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        LocalDate currentDate = new LocalDate(); //when a DateTime object is created with no value, it takes the current date as a value
        age = currentDate.getYear() - dob.getYear();//current year - year of birth
        username = getUsername();
        iD = getID();
        System.out.println(iD);
    }

    public String getUsername() {
        String genUsername;
        genUsername = name.replaceAll("\\s", "");
        genUsername = genUsername + age;
        System.out.println(genUsername);
        return genUsername;

    }

    public String getID() {
        String genID;
        genID = "S" + iDCounter;
        iDCounter++;
        return genID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }


}
