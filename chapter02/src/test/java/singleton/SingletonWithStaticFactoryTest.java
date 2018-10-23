package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-23
 */
public class SingletonWithStaticFactoryTest {

    @Test
    public void print() {
        /*SingletonWithStaticFactory swsf = SingletonWithStaticFactory.getInstance();
        swsf.print();*/
        // 设置成静态工厂方法可以直接创建实例并调用
        SingletonWithStaticFactory.getInstance().print();
    }
}