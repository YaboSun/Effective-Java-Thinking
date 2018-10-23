package telescoping;

/**
 * @author YaboSun
 * @since Created in 18-10-18
 *
 * 当有大量构造器参数第一种方式---telescoping constructor
 * 重叠构造器模式
 * 通过增加不一样的构造器来进行满足多种需求
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private String sex;

    /**
     * 学生身高
     */
    private double height;

    /**
     * 学生所在城市
     */
    private String city;

    /**
     * 所在班级号
     */
    private int classNum;
    /**
     *
     * @param name 学生姓名
     * @param sex 学生性别
     * @param height 学生身高
     */
    public Student(String name, String sex, double height) {
        this.name = name;
        this.sex = sex;
        this.height = height;
    }

    /**
     *
     * @param name
     * @param sex
     * @param height
     * @param city
     */
    public Student(String name, String sex, double height, String city) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.city = city;
    }

    /**
     *
     * @param name
     * @param sex
     * @param height
     * @param city
     * @param classNum
     */
    public Student(String name, String sex, double height, String city, int classNum) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.city = city;
        this.classNum = classNum;
    }
}
