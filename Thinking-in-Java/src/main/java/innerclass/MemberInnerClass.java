package innerclass;

/**
 * Created by YaboSun in 18-11-5
 *
 * 内部类第一种：成员内部类
 */
public class MemberInnerClass {
    private String string;

    public void outerDisplay() {
        System.out.println("outer class");
    }

    public class InnerClass {
        public void innerDisplay() {
            // 使用外部类的私有属性，并赋值
            string = "this is inner class string";
            System.out.println(string);

            // 调用外部类的方法
            outerDisplay();
        }


    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }
}
