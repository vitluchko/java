package org.example;

public interface UserBuilder {
    UserBuilder setName(String name);
    UserBuilder setIdCode(String idCode);
    UserBuilder setCountry(String country);

    User build();
}
