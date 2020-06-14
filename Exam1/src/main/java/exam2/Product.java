package exam2;

import javax.validation.constraints.NotNull;

public class Product {
    public int productId;


    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    public String name;
    @ProductPrice
    @NotNull
    public int price;

}
