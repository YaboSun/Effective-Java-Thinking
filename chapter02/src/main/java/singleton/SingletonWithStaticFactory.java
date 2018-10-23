package singleton;

/**
 * Created by YaboSun in 18-10-23
 *
 * 好处是组成类的成员的声明很清楚的表达这个类是一个Singleton
 * 提供了灵活性，在不改变其API的前提下可以改变该类是否为Singleton的想法
 *
 * 缺点：可以很容易被修改比如改成为每个调用该方法的线程返回该类的唯一的实例
 */
public class SingletonWithStaticFactory {
    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    private SingletonWithStaticFactory() {}

    public static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("This is SingletonWithStaticFactory method");
    }
}
