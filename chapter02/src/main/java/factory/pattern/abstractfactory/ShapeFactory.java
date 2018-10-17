package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class ShapeFactory extends AbstractFactoryPattern {
    @Override
    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }
}
