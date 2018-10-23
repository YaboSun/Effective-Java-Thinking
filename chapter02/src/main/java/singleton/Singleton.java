package singleton;

/**
 * Created by YaboSun in 18-10-23
 *
 * <<大话设计模式>>中关于单例模式实现
 *
 * 第一种使用延迟实例的方法
 */
public class Singleton {


    private Singleton() {}

    // 通过延迟实例的方法创建
    // 需要注意的是如果在多线程中可能出现产生俩个不同的Singleton对象
    // 通过synchronized可以保证只有一个对象，但是却带来性能问题
    // 如果实际生产中对性能不是很关键 那么直接使用这个关键字是最方便有效的
    private static Singleton uniqueInstance;
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // 通过急切创建实例
    // 直接在静态工厂方法中返回实例，而不是判断是否创建
    private static Singleton uniqueInstance1 = new Singleton();
    public static Singleton getInstance1() {
        return uniqueInstance1;
    }
    public void print() {
        System.out.println("This is Singleton");
    }
}
