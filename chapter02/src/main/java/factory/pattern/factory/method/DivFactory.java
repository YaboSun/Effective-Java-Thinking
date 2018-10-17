package factory.pattern.factory.method;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class DivFactory implements FactoryMethodPattern {
    public Operation createOperation() {
        System.out.println("除法运算");
        return new Div();
    }
}
