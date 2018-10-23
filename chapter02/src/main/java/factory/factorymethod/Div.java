package factory.factorymethod;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class Div implements Operation {
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0");
        }
        return numberA / numberB;
    }
}
