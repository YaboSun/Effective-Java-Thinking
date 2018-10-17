package factory.pattern.simple.factory;

import org.junit.Test;

/**
 * @Author: YaboSun
 * @Date: Created in 18-10-17
 * @Description:
 */
public class SimpleFactoryPatternTest {

    @Test
    public void create() {
        SimpleFactoryPattern.create("apple");
        SimpleFactoryPattern.create("orange");
    }
}