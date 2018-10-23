package singleton;

import org.junit.Test;

import java.lang.reflect.AccessibleObject;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-23
 */
public class SingletonWithFinalFieldTest {

    @Test
    public void print() {
        SingletonWithFinalField swff = SingletonWithFinalField.INSTANCE;
        swff.print();
    }
}