package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class ColorFactory extends AbstractFactoryPattern {
    @Override
    public Color getColor(String colorName) {
        if (colorName == null) {
            return null;
        }

        if (colorName.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("green")) {
            return new Green();
        } else if (colorName.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeName) {
        return null;
    }
}
