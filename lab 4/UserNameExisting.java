package org.example;

import jakarta.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {CheckUserInfo.class})
public @interface UserNameExisting {
    String message() default "{UserNameExisting}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
