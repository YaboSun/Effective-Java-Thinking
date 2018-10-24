package file.dir;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by YaboSun in 18-10-24
 *
 * 通过定义一个作为list()参数的匿名内部类来进行进一步的优化
 */
public class DirList3 {
    public void sortAndPrintFileName(final String[] args, final File path) {
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }

        // 按照字母顺序对文件名称进行排序
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        // 打印输出文件名
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
