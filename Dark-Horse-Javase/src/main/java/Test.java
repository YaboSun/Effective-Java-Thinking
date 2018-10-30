import java.util.Scanner;

/**
 * Created by YaboSun in 18-10-30
 */
public class Test {
    public static void main(String[] args) {

        /**
         * 测试byte运算
         */
        /*byte b = -128;
        b--;
        System.out.println(b);*/

        /*byte b = 127;
        b += 1;
        System.out.println(b);*/

        /*byte b = -128;
        System.out.println(b << 1);*/

        /**
         * 测试三元运算符使用
         */
        /*int a = 10, b = 20, c = 30;
        int max, temp;
        temp = (a >= b) ? b : a;
        max = !(temp >= c) ? temp : c;
        System.out.println("max = " + max);*/

        /**
         * 测试键盘输入
         */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入数a");
        int a = sc.nextInt();
        System.out.println("请输入b");
        int b = sc.nextInt();
        System.out.println("俩数之和：" + (a + b));
        int max = (a > b) ? a : b;
        System.out.println("最大数为" + max);*/

        /**
         * 测试switch语句
         *
         * 给定一个值 输出对应星期
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-7的数值");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case  3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                break;
        }
    }
}
