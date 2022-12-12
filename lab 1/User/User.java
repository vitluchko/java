import java.util.Objects;

/**
 * Main class
 *
 * @author Vitaliy
 * @version 1.1
 * @see UserBuilder
 */
public class User {
    /**
     * Parameters
     */
    private String id;
    private String name;
    private String indef_code;
    private String email;
    private String country;
    private String amount;
    private String currency;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndef_code(String indef_code) {
        this.indef_code = indef_code;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Method equals
     *
     * @param o is class object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id) && name.equals(user.name) && indef_code.equals(user.indef_code) && email.equals(user.email) && country.equals(user.country) && amount.equals(user.amount) && currency.equals(user.currency);
    }

    /**
     * hashcode
     *
     * @return hash objects
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, indef_code, email, country, amount, currency);
    }

    /**
     * Method toString()
     *
     * @return string with full information about user
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", indef_code='" + indef_code + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
