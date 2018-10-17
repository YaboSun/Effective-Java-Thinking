package factory.pattern.simple.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: YaboSun
 * @Date: Created in 18-10-17
 * @Description:
 */
public class FactoryPatternTest {

    @Test
    public void create() {
        FactoryPattern.create("product apple");
        FactoryPattern.create("product orange");
    }
}