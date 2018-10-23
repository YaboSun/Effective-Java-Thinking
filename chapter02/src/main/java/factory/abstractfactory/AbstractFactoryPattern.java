package factory.abstractfactory;

/**
 * 参考：http://www.runoob.com/design-pattern/abstract-factory-pattern.html
 * @author  YaboSun
 * @since  18-10-17
 *
 * 抽象工厂模式类
 *
 * 适用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品
 *
 * 抽象工厂模式主要角色：
 * AbstractFactory（1个）：原始抽象工厂
 * SubFactory（多个）： 子类工厂对抽象工厂进行扩展
 * FactoryInterface（多个）： 子类工厂通过Producer创建的接口
 * ConcreteFactoryInterface(多个)： 创建的接口具体实现
 * FactoryProducer： create工厂接口
 *
 * 代码实例：
 * 通过Shape以及Color接口以及实现这些接口的实体类
 */
public abstract class AbstractFactoryPattern {
    /**
     * 获取Color工厂
     * @param color 传入的Color名称
     * @return 返回对应的Color类型
     */
    public abstract Color getColor(String color);

    /**
     * 获取Shape工厂
     * @param shape 传入的shape名称
     * @return 返回对应的Shape类型
     */
    public abstract Shape getShape(String shape);
}
