package org.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckUserId implements ConstraintValidator<UserIdCodeExisting, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getIdCode().matches("[\\d]+") && user.getIdCode() != null && user.getIdCode().length() == 10;
    }
}
