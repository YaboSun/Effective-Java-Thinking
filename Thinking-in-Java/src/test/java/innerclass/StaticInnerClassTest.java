package innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-11-6
 */
public class StaticInnerClassTest {

    @Test
    public void minMax() {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        StaticInnerClass.Pair pair = StaticInnerClass.minMax(d);
        System.out.println("min = " + pair.getFirstNum());
        System.out.println("max = " + pair.getSecondNum());
    }
}