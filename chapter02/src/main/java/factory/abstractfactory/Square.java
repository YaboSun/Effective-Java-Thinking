package factory.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method" + "画出正方形");
    }
}
