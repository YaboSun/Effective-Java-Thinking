package file.dir;

import java.io.File;
import java.util.Arrays;

/**
 * Created by YaboSun in 18-10-24
 *
 * 用于显示当前目录下的所有文件名
 */
public class DirList {
    /*public static void main(@NotNull String[] args) {
        // 获取当前文件路径
        File path = new File(".");

        // 用于存放文件名称的数组
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }

        // 按照字母对文件名称进行排序
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        // 打印输出文件名
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }*/

    public void sortAndPrintFileName(String[] args, File path) {

        // 用于存放文件名称的数组
        // TODO 没有太清楚这个args的作用以及DirFilter
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }

        // 按照字母顺序对文件名称进行排序
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        // 打印输出文件名
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
