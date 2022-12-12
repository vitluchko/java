import java.util.UUID;

/**
 * Anonymous template of user
 *
 * @author Vitaliy
 * @version 1.1
 */

public class UserAnonymous extends UserBuilder {
    @Override
    void buildID() {
        user.setId(String.valueOf(UUID.randomUUID()));
    }

    @Override
    void buildName() {
        user.setName("******");
    }

    @Override
    void buildICode() {
        user.setIndef_code(String.valueOf(UUID.randomUUID()));
    }

    @Override
    void buildEmail() {
        user.setEmail("******");
    }

    @Override
    void buildCountry() {
        user.setCountry("******");
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
