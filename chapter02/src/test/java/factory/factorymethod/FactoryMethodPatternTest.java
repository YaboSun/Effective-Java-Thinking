package factory.factorymethod;

import org.junit.Test;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 *
 * 用于测试整个工厂方法模式
 */
public class FactoryMethodPatternTest {

    @Test
    public void createOperation() throws Exception {

        // 利用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
        FactoryMethodPattern addFactory = (FactoryMethodPattern) Class
                .forName("factory.factorymethod.AddFactory")
                .newInstance();
        FactoryMethodPattern subFactory = (FactoryMethodPattern) Class
                .forName("factory.factorymethod.SubFactory")
                .newInstance();
        FactoryMethodPattern mulFactory = (FactoryMethodPattern) Class
                .forName("factory.factorymethod.MulFactory")
                .newInstance();
        FactoryMethodPattern divFactory = (FactoryMethodPattern) Class
                .forName("factory.factorymethod.DivFactory")
                .newInstance();

        // 通过工厂对象创建相应的实例对象
        Operation add = addFactory.createOperation();
        Operation sub = subFactory.createOperation();
        Operation mul = mulFactory.createOperation();
        Operation div = divFactory.createOperation();

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
        System.out.println(mul.getResult(1, 1));
        System.out.println(div.getResult(1, 1));
    }
}