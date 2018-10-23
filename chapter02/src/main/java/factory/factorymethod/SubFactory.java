package factory.factorymethod;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class SubFactory implements FactoryMethodPattern {
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
