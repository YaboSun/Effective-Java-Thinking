package innerclass;

/**
 * Created by YaboSun in 18-11-6
 *
 * 内部类的第四种--静态内部类
 *
 * 当内部类只用于隐藏，不需要引用外部类的对象
 * 那么这个时候可以将内部类定义为static
 *
 * 以下代码是实现获取数组中的最大最小值
 * 一般的实现思路是可以分开俩个函数来分别计算最大值以及最小值
 * 但是这样的话需要遍历数组俩次，影响性能，
 * 以下通过静态内部类的方式实现
 */
public class StaticInnerClass {
    static class Pair {
        private double firstNum;
        private double secondNum;

        public Pair(double firstNum, double secondNum) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
        }

        public double getFirstNum() {
            return firstNum;
        }

        public double getSecondNum() {
            return secondNum;
        }
    }

    public static Pair minMax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values) {
            if (min > v) {
                min = v;
            }

            if (max < v) {
                max = v;
            }
        }
        return new Pair(min, max);
    }
}
