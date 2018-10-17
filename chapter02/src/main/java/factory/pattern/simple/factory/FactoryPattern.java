package factory.pattern.simple.factory;

/**
 * @Author: YaboSun
 * @Date: Created in 18-10-17
 * @Description: 简单工厂模式：简单工厂模式严格意义上讲不能说是一个设计模式
 * 因为它不是Gof23种设计模式之一，所以说是一种编程习惯更恰当些
 * 简单模式可以根据参数的不同返回不同类的实例，简单工厂模式专门定义一个类来负责创建其他类的实例
 * 被创建的实例通常都具有共同的父类
 *
 * 简单工厂模式包含如下角色：
 * Factory：工厂角色
 * Product：抽象产品角色
 * ConcreteProduct：具体产品角色
 */
public class FactoryPattern {

    /**
     * 用于生成不同的Product
     * @param productName 想要生成的Product名称
     * @return 返回生成的Product
     */
    public static Product create(String productName) {
        // 生成Product
        if (productName.equalsIgnoreCase("Product Apple")) {
            return new ProductApple(); // 生成Product Apple
        } else if (productName.equalsIgnoreCase("Product Orange")) {
            return new ProductOrange(); // 生成Product Orange
        }
        return null;
    }
}
