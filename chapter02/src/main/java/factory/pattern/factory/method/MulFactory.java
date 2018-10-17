package factory.pattern.factory.method;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class MulFactory implements FactoryMethodPattern {
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
