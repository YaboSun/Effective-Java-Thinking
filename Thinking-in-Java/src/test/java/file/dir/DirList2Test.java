package file.dir;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-24
 */
public class DirList2Test {

    DirList2 dirList2 = new DirList2();
    @Test
    public void sortAndPrintFileName() {
        // 获取当前文件路径
        File path = new File(".");
        String[] args = {"pom.xml"};
        dirList2.sortAndPrintFileName(args, path);
    }
}