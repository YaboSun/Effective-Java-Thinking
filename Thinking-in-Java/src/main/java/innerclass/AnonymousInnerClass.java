package innerclass;

/**
 * Created by YaboSun in 18-11-5
 *
 * 匿名内部类--内部类的第三种
 */
public class AnonymousInnerClass {

    public InnerClass getInnerClass(final int num, String string2) {
        return new InnerClass() {
            int number = num;
            public int getNumber() {
                return number;
            }
        };
    }

}

interface InnerClass {
}
