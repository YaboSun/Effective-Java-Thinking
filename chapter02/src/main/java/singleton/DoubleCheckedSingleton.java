package singleton;

/**
 * Created by YaboSun in 18-10-23
 *
 * 如果你对性能有一定要求可以使用这种方法实现
 * 较Singleton中的俩种方法都是一个改进
 */
public class DoubleCheckedSingleton {
    /**
     * volatile关键字确保：
     * 当uniqueInstance被初始化成Singleton实例时
     * 多个线程正确的处理uniqueInstance变量
     */
    private volatile static DoubleCheckedSingleton uniqueInstance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        // 检查实例，如果不存在，就进入同步区块
        // 这里只有第一次才彻底执行，可以保证性能，因为多次的同步肯定会影响性能
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                // 进入区块后再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
