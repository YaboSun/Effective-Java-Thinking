package builder.pattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author YaboSun
 * @since Created in 18-10-18
 */
public class StudentTest {
    @Test
    public void client() {
        Student student = new StudentBuilder("zhangsan")
                .setCity("wuhan")
                .setSex("nan")
                .setHeight(180)
                .setClassNum(191134)
                .build();
    }
}