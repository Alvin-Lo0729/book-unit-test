package idv.alvin.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void fullNameTest() {
        Student student = new Student("Michael", "Jordan");
        String actual = student.getFullName();

        Assertions.assertEquals("Michael Jordan", actual);
    }
}
