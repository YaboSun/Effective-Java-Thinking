package factory.simplefactory;

import org.junit.Test;

/**
 * @author YaboSun
 * @since  Created in 18-10-17
 */
public class SimpleFactoryPatternTest {

    @Test
    public void create() {
        SimpleFactoryPattern.create("apple");
        SimpleFactoryPattern.create("orange");
    }
}