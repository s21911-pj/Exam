package exam2;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductPriceValidator implements ConstraintValidator<ProductPrice, Integer> {
    private int price;

    @Override
    public void initialize(ProductPrice constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer p, ConstraintValidatorContext constraintValidatorContext) {
        return p > 0;
    }


}