package file.dir;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by YaboSun in 18-10-24
 *
 * 查看FilenameFilter可以知道只有一个accept()方法
 * 创建这个类的目的在于把accept()方法提供给list()使用
 * 使list()可以回调accept()，进而决定哪些文件包含在列表中
 * 这种结构称为回调，或者说这是一个策略模式的例子
 */
public class DirFilter implements FilenameFilter {
    /**
     * 正则表达式的编译表示
     */
    private Pattern pattern;

    public DirFilter(String regex) {
        /**
         * 将给定的正则表达式编译为带有给定标志的模式
         */
        this.pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        // 查阅Pattern采用的典型的调用序列
        // 创建一个匹配器，匹配给定的输入与此模式
        // 这里的参数是一个charSequence
        Matcher matcher = pattern.matcher(name);
        // 编译给定的正则表达式，并尝试匹配给定的输入
        boolean b = matcher.matches();
        return b;
    }
}
