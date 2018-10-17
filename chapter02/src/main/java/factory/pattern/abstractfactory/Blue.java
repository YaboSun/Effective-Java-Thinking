package factory.pattern.abstractfactory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method." + "填充蓝色");
    }
}
