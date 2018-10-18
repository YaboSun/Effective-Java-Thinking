package builder.pattern;

/**
 * @author YaboSun
 * @since Created in 18-10-18
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

    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.getName();
        sex = studentBuilder.getSex();
        height = studentBuilder.getHeight();
        city = studentBuilder.getCity();
        classNum = studentBuilder.getClassNum();
    }
}
