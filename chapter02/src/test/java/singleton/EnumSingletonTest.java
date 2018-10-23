package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-23
 */
public class EnumSingletonTest {

    @Test
    public void print() {
        EnumSingleton.INSTANCE.print();
    }
}