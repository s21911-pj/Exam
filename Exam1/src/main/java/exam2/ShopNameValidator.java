package exam2;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class ShopNameValidator {

    public static boolean validateShopName(String shopName) {
        return shopName.matches ("[A-Z][a-zA-Z]*[1-9]d{2}-d{3}-d{3}");
    }


}

