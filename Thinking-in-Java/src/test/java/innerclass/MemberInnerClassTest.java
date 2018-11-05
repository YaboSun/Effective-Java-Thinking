package innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YaboSun in 18-11-5
 */
public class MemberInnerClassTest {

    @Test
    public void outerDisplay() {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.InnerClass innerClass = memberInnerClass.getInnerClass();
        innerClass.innerDisplay();
    }
}