package factory.simplefactory;

/**
 * @author  YaboSun
 * @since  Created in 18-10-17
 */
public class ProductApple implements Product {
    public ProductApple() {
        this.getProduct();
    }

    public void getProduct() {
        System.out.println("Product Apple");
    }
}
