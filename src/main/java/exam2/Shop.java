package exam2;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    @Length(min = 6, max = 6, message = "Sorry wrong name")
    @Pattern(regexp = "[0-9]+")
    public int shopId;
    public String name;
    List<Product> productList = new ArrayList<> ();
    List<Product> soldProduct = new ArrayList<> ();

    public void addNewProduct(Product product) {
        productList.add (product);
    }



}

