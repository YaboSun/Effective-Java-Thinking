package factory.pattern.factory.method;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 *
 * 运算接口
 */
public interface Operation {
    /**
     * 用于获得四则运算后的结果
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 返回俩个数运算的结果
     * @throws Exception 可能存在分母为0等异常
     */
    double getResult(double numberA, double numberB) throws Exception;
}
