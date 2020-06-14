package exam2;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ProductPriceValidator implements ConstraintValidator<ProductPrice, Integer> {


    @Override
    public void initialize(ProductPrice constraintAnnotation) {
        constraintAnnotation.price ();
    }

    @Override
    public boolean isValid(Integer price, ConstraintValidatorContext context ) {
        System.out.println ("czy to w ogole dziala?");
        return price > 0;
    }


}