package factory.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method" + "画出圆形");
    }
}
