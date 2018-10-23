package factory.abstractfactory;

import org.junit.Test;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class AbstractFactoryPatternTest {

    @Test
    public void main() {
        // 获取形状工厂
        AbstractFactoryPattern shapeFactory = FactoryProducer.getFactory("shape");

        // 获取形状为circle的对象
        Shape circleShape = shapeFactory.getShape("circle");

        // 调用circle的draw方法
        circleShape.draw();

        // 获取颜色工厂
        AbstractFactoryPattern colorFactory = FactoryProducer.getFactory("color");

        // 获取颜色为red的对象
        Color redColor = colorFactory.getColor("red");

        // 调用red的fill方法
        redColor.fill();
    }
}