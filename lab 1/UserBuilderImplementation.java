package org.example;

public class UserBuilderImplementation implements UserBuilder {
    User user = new User();

    @Override
    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }

    @Override
    public UserBuilder setIdCode(String idCode) {
        user.setIdCode(idCode);
        return this;
    }

    @Override
    public UserBuilder setCountry(String country) {
        user.setCountry(country);
        return this;
    }

    @Override
    public User build() {
        return user;
    }
}
