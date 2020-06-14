package exam2;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ProductPriceValidator productPriceValidator = new ProductPriceValidator ();
        Product product = new Product (1, "something", -20);
        System.out.println (productPriceValidator);
        Validator validator = Validation.buildDefaultValidatorFactory ().getValidator ();
        Set<ConstraintViolation<ProductPriceValidator>> validate = validator.validate (productPriceValidator);
        System.out.println (validate);


        Validator validator2 = Validation.buildDefaultValidatorFactory ().getValidator ();
        Set<ConstraintViolation<Product>> validate2 = validator.validate (product);
        System.out.println (validate2);


        Shop shop = new Shop ("sprawdze czy dzialasz dziadzie");
        Validator validator3 = Validation.buildDefaultValidatorFactory ().getValidator ();
        Set<ConstraintViolation<Shop>> validate3 = validator.validate (shop);
        System.out.println (validate3);


    }
}
