package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method." + "填充红色");
    }
}
