/**
 * Admin class
 * @author Vitaliy
 * @version 1.1
 * @see BuildUserRunner
 */
public class Admin {
    UserBuilder builder;

    public void setBuilder(UserBuilder builder) {
        this.builder = builder;
    }

    User buildUser(){
        builder.createUser();
        builder.buildID();
        builder.buildName();
        builder.buildICode();
        builder.buildEmail();
        builder.buildCountry();
        builder.buildAmount();
        builder.buildCurrency();

        User user = builder.getUser();

        return user;
    }

}
