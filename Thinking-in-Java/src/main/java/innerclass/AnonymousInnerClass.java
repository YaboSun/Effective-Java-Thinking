package innerclass;

/**
 * Created by YaboSun in 18-11-5
 *
 * 匿名内部类--内部类的第三种
 */
public class AnonymousInnerClass {

    // 注意final关键字
    public InnerClass getInnerClass(final int num, final String string) {
        return new InnerClass() {
            int number = num;
            public void getNum() {
                System.out.println("num is " + number);
            }

            public void print() {
                System.out.println("string is " + string);
            }
        };
    }

}

