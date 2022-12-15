package org.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckUserCountry implements ConstraintValidator<UserCountryExisting, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getCountry().matches("^[a-zA-Z]*$") && user.getCountry() != null;
    }
}
