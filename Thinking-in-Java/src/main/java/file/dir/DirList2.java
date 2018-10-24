package file.dir;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by YaboSun in 18-10-24
 *
 * 通过使用匿名内部类对DirList进行改写
 * 这个比DirList有一定的改进是因为现在
 * FilenameFilter和DirList2紧密绑定
 * 在一起
 */
public class DirList2 {
    /**
     * 将当前目录下的文件以及文件夹名称排序并打印输出
     * @param args 用于判断
     * @param path 文件所在路径
     */
    public void sortAndPrintFileName(String[] args, File path) {
        // 用于存放文件名称的数组
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(filter(args[0]));
        }

        // 按照字母顺序对文件名称进行排序
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        // 打印输出文件名
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }

    /**
     * 通过使用匿名内部类改写
     * @param regex 正则表达式，这个传入的参数必须是final
     *              这在匿名内部类是必须的，这样才能使用来
     *              自该类范围之外的对象
     * @return 如果传入的文件名称与正则表达式符合则返回true
     */
    public static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }
}
