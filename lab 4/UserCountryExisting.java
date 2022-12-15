package org.example;

import jakarta.validation.Payload;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {CheckUserCountry.class})
public @interface UserCountryExisting {
    String message() default "{UserCountryExisting}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
