package org.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckUserInfo implements ConstraintValidator<UserNameExisting, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getName().matches("^[a-zA-Z]*$") && user.getName() != null;
    }
}
