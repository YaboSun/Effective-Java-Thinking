package factory.factorymethod;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class AddFactory implements FactoryMethodPattern {
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
