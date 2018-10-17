package factory.pattern.simple.factory;

/**
 * @author YaboSun
 * @since Created in 18-10-17
 */
public class ProductOrange implements Product {
    public ProductOrange() {
        this.getProduct();
    }

    public void getProduct() {
        System.out.println("Product Orange");
    }
}
