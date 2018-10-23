package factory.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method." + "填充绿色");
    }
}
