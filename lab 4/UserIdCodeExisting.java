package org.example;

import jakarta.validation.Payload;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {CheckUserId.class})
public @interface UserIdCodeExisting {
    String message() default "{UserIdCodeExisting}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
