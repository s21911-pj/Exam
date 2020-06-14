package exam2;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product = new Product (1, "something", 159);
        System.out.println ("Product");
        Validator validator = Validation.buildDefaultValidatorFactory ().getValidator ();
        Set<ConstraintViolation<Product>> validate = validator.validate (product);
        System.out.println (validate);

    }
}
