package JUnit.JUnit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    @Test
    public void getAllStudents() {
        Student student1 = new Student("Евгений", 34, true);
        Student student2 = new Student("Мария", 23, false);
        Student student3= new Student("Оля", 48, false);

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        List<Student> actual = university.getAllStudents();

        List<Student> expected = new ArrayList<Student>();

        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(actual,expected);
    }
}
