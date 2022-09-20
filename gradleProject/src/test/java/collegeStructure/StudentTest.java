package collegeStructure;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUsername() {
        Student student = new Student("John Cunniffe", new LocalDate(9,3,2001));
        String studentName = student.getUsername();
        assertEquals("JohnCunniffe21", equals(studentName));
    }

    @Test
    void getID() {
        Student s = new Student("Thomas Rushe", new LocalDate(5,4,1970));
        int numberPart = Student.iDCounter-1;
        assertEquals("","S"+ numberPart);

    }
}