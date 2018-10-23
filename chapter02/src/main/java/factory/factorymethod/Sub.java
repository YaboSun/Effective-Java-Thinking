package factory.factorymethod;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Sub implements Operation {
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA - numberB;
    }
}
