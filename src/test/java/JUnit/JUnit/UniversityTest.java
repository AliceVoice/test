package JUnit.JUnit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    @Test
    public void getAllStudents() {
        Student student1 = new Student("Олег", 34, true);
        Student student2 = new Student("Александра", 23, false);
        Student student3= new Student("Юля", 48, false);

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        List<Student> actual = university.getAllStudents();

        List<Student> expected = new ArrayList<Student>();

        expected.add(student1);
        expected.add(student2);
        expected.add(student3);

        assertEquals(actual,expected);
    }
}
