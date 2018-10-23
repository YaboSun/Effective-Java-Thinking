package singleton;

/**
 * Created by YaboSun in 18-10-23
 *
 * @since jdk1.5
 * 只需编写一个包含单个元素的枚举类型
 *
 * 首选方法
 * 简洁而且无偿提供了序列化机制，绝对防止多次实例化
 */
public enum EnumSingleton {
    INSTANCE;

    public void print() {
        System.out.println("This is EnumSingleton method");
    }
}
