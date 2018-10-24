package file.dir;

import com.sun.istack.internal.NotNull;

import java.io.File;
import java.util.Arrays;

/**
 * Created by YaboSun in 18-10-24
 *
 * 用于显示当前目录下的所有文件名
 */
public class DirList {
    public static void main(@NotNull String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
