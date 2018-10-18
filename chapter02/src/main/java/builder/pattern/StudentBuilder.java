package builder.pattern;

/**
 * @author YaboSun
 * @since Created in 18-10-18
 */
public class StudentBuilder {
    // 必要参数
    /**
     * 学生姓名
     */
    private String name;

    // 可选参数
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

    public StudentBuilder(String name) {
        this.name = name;
    }

    public StudentBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public StudentBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public StudentBuilder setClassNum(int classNum) {
        this.classNum = classNum;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public String getCity() {
        return city;
    }

    public int getClassNum() {
        return classNum;
    }
}
