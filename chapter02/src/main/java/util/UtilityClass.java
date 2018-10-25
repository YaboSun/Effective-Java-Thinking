package util;

/**
 * Created by YaboSun in 18-10-25
 *
 * 通过私有构造器来强化不可实例化的能力
 * 一般这种类是作为工具类，只为了方便使用
 * 而不需要实例化
 */
public class UtilityClass {

    /**
     * 提供私有构造器为了不被实例化
     */
    private UtilityClass() {
        throw new AssertionError();
    }
}
