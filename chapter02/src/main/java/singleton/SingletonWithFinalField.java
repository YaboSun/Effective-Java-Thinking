package singleton;

/**
 * Created by YaboSun in 18-10-23
 *
 * 第一种实现Singleton方法
 * 公有静态成员是个final域，这种方法以及第二种方法
 * 都需要保持构造器为私有的
 */
public class SingletonWithFinalField {
    public static final SingletonWithFinalField INSTANCE = new SingletonWithFinalField();

    /**
     * 私有构造器
     */
    private SingletonWithFinalField() {}

    public void print() {
        System.out.println("This is SingletonWithFinalField method");
    }
}
