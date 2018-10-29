package file.dir;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-10-29
 */
public class DirectoryTest {

    /*Directory directory = new Directory();*/
    @Test
    public void recurseDirs() {
        String[] args = {};
        if (args.length == 0) {
            System.out.println(Directory.walk("."));
        } else {
            for (String arg : args) {
                System.out.println(Directory.walk(arg));
            }
        }
    }
}