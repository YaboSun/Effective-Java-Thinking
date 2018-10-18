package beans;
/**
 * @author YaboSun
 * @since Created in 18-10-18
 *
 * 第二种模式 JavaBeans模式
 * 调用一个无参构造器来创建对象，然后调用setter方法来设置每个必要的参数，
 * 以及每个相关的可选参数
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

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
}
