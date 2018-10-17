package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method" + "画出三角形");
    }
}
