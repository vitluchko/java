package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String name;
    private String idCode;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", idCode='" + idCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String toStr() {
        return "name='" + name +
                ":: idCode='" + idCode +
                ":: country='" + country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return idCode.equals(user.idCode) && name.equals(user.name) && country.equals(user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idCode, country);
    }

    public static User toObject(String string) {
        String[] str = string.split(":: ");
        var values = new ArrayList<String>();

        for (String item : str) {
            String[] innerItem = item.split("='");
            values.add(innerItem[1]);
        }


        var user = new UserBuilderImplementation()
                .setName(values.get(0))
                .setIdCode(values.get(1))
                .setCountry(values.get(2))
                .build();

        return user;
    }
}
