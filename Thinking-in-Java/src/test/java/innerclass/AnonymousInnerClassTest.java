package innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-11-5
 */
public class AnonymousInnerClassTest {

    @Test
    public void getInnerClass() {
        int number = 2;
        String string = "this is anonymous class test";
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        InnerClass innerClass = anonymousInnerClass.getInnerClass(number, string);
    }
}