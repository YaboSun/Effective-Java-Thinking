package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-23
 */
public class SingletonTest {

    @Test
    public void print() {
        Singleton.getInstance().print();
    }
}