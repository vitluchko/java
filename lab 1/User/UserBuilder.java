/**
 * Abstract class
 * @author Vitaliy
 * @version 1.1
 * @see UserStandard
 * @see UserAnonymous
 */
public abstract class UserBuilder {
    User user;

    void createUser(){
        user = new User();
    }

    abstract void buildID();
    abstract void buildName();
    abstract void buildICode();
    abstract void buildEmail();
    abstract void buildCountry();
    abstract void buildAmount();
    abstract void buildCurrency();

    User getUser(){
        return user;
    }
}
