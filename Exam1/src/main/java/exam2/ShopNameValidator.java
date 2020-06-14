package exam2;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;


public class ShopNameValidator implements ConstraintValidator<ShopName, String> {

//    public static boolean validateShopName(String shopName) {
//        return shopName.matches ("[A-Z][a-zA-Z]*[1-9]d{2}-d{3}-d{3}");
//    }
//    https://strefainzyniera.pl/artykul/1052/regex-w-java

    @Override
    public void initialize(ShopName constraintAnnotation) {
        constraintAnnotation.name ();
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        System.out.println ("czy to dziala poprawnie?");
        return name.isEmpty () && name.matches ("[A-Z][a-zA-Z]*") && name.length ()>6;
    }


}

