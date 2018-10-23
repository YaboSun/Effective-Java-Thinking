package factory.simplefactory;

/**
 * 参考： http://www.cnblogs.com/Bobby0322/p/4178412.html
 * @author YaboSun
 * @since  Created in 18-10-17
 *
 * 简单工厂模式：简单工厂模式严格意义上讲不能说是一个设计模式
 * 因为它不是Gof23种设计模式之一，所以说是一种编程习惯更恰当些
 * 简单模式可以根据参数的不同返回不同类的实例，简单工厂模式专门定义一个类来负责创建其他类的实例
 * 被创建的实例通常都具有共同的父类
 *
 * 简单工厂模式包含如下角色：
 * Factory：工厂角色
 * Product：抽象产品角色
 * ConcreteProduct：具体产品角色
 *
 * 模式分析：
 * 1、将对象的创建以及对象本身业务处理分离可以降低系统的耦合度，使得俩者修改相对容易
 * 2、在调用工厂类的工厂方法时，由于工厂方法是静态方法，使用起来很方便，可通过类名直接调用，
 * 而且只需要传入一个简单的参数即可，在实际开发中，还可以在调用时将所传入的参数保存在XML等格式的配置文件中，修改参数时无须修改任何源代码。
 * 3、简单工厂模式最大的问题在于工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，这一点与开闭原则是相违背的
 * 4、简单工厂模式的要点在于：当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。
 *
 * 模式优点：
 * 1、客户端可以免除直接创建产品对象的责任，实现了对责任的分割
 * 2、客户端无须知道所创建的具体产品类的类名
 *
 * 模式缺点：
 * 1、工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响
 * 2、会增加系统中类的个数，在一定程序上增加了系统的复杂度和理解难度
 * 3、一旦添加新产品就不得不修改工厂逻辑
 * 4、由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构
 *
 * 模式适用场景：
 * 1、工厂类负责创建的对象比较少：由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂
 * 2、客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，
 * 甚至连类名都不需要记住，只需要知道类型所对应的参数
 */
public class SimpleFactoryPattern {

    /**
     * 用于生成不同的Product
     * @param productName 想要生成的Product名称
     * @return 返回生成的Product
     */
    public static Product create(String productName) {
        // 生成Product
        if (productName.equalsIgnoreCase("Apple")) {
            return new ProductApple(); // 生成Product Apple
        } else if (productName.equalsIgnoreCase("Orange")) {
            return new ProductOrange(); // 生成Product Orange
        }
        return null;
    }
}
