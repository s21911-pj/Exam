package exam2;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ProductPriceValidator.class)

public @interface ShopName {
    public String name() default "Name";

    String message() default "Bad Name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
