package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class FactoryProducer {
    public static AbstractFactoryPattern getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
