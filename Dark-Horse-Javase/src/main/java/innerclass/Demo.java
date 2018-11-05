package innerclass;

/**
 * Created by YaboSun in 18-11-5
 */
public class Demo {


    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.method();
    }
}


class Outer {
    class Inner {
        public void method() {
            System.out.println("匿名内部类测试");
        }
    }
}