import java.util.UUID;

/**
 * Standard template of user
 * @author Vitaliy
 * @version 1.1
 */
public class UserStandard extends UserBuilder {
    @Override
    void buildID() {
        user.setId(String.valueOf(UUID.randomUUID()));
    }

    @Override
    void buildName() {
        user.setName("Name");
    }

    @Override
    void buildICode() {
        user.setIndef_code(String.valueOf(UUID.randomUUID()));
    }

    @Override
    void buildEmail() {
        user.setEmail("email@gmail.com");
    }

    @Override
    void buildCountry() {
        user.setCountry("Country");
    }

    @Override
    void buildAmount() {
        user.setAmount("Amount");
    }

    @Override
    void buildCurrency() {
        user.setCurrency("Currency");
    }
}
