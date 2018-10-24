package file.dir;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-24
 */
public class DirList3Test {

    DirList3 dirList3 = new DirList3();
    @Test
    public void sortAndPrintFileName() {
        // 获取当前文件路径
        File path = new File(".");
        String[] args = {"pom.xml"};
        dirList3.sortAndPrintFileName(args, path);
    }
}