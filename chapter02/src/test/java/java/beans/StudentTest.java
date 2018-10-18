package beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author YaboSun
 * @since Created in 18-10-18
 */
public class StudentTest {

    @Test
    public void test() {
        Student student = new Student();
        student.setName("张三");
        student.setCity("wuhan");
        student.setHeight(185);

        assertEquals(student.getName(), "张三");
    }
}