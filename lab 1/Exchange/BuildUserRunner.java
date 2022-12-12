/**
 * Interface
 *
 * @author Vitaliy
 * @version 1.1
 * @see User
 * @see Exchange
 */
public class BuildUserRunner {
    public static void main(String[] args) {
        Admin admin = new Admin();

        admin.setBuilder(new UserStandard());
        User user = admin.buildUser();

        System.out.println(user);

        admin.setBuilder(new UserAnonymous());
        user = admin.buildUser();

        System.out.println(user);

        Director director = new Director();

        director.setBuilder(new BuyExchange());
        Exchange exchange = director.buildExchange();

        System.out.println(exchange);

        director.setBuilder(new SellExchange());
        exchange = director.buildExchange();

        System.out.println(exchange);
    }
}
