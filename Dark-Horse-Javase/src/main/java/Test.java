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
        /*Scanner sc = new Scanner(System.in);
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
        }*/

        /**
         * 测试循环语句使用
         *
         * 水仙花数
         */

        /*for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (((a * a * a) + (b * b * b) + (c * c * c)) == i) {
                System.out.println(i);
            }
        }*/

        /**
         * 字面值存放在栈中 并可以共享
         */
        /*int a = 3;
        int b = 3;
        System.out.println("a = " + a + "b = " + b);*/

        /**
         * 二维数组使用demo
         */
        /*int[][] arr = {{22,66,44}, {77,33,88}, {25,45,65}, {11,66,99}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);*/

        Person.country = "中国";

    }


}

class Person {
    static String country;
}
