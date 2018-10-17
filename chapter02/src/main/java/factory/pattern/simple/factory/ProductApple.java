package factory.pattern.simple.factory;

/**
 * @Author: YaboSun
 * @Date: Created in 18-10-17
 * @Description:
 */
public class ProductApple implements Product {
    public ProductApple() {
        this.getProduct();
    }

    public void getProduct() {
        System.out.println("Product Apple");
    }
}
