/**
 * Buy template
 *
 * @author Vitaliy
 * @version 1.1
 */
public class BuyExchange extends ExchangeBuilder{
    @Override
    void buildsusd() {
        exchange.setBusd(40.42);
    }

    @Override
    void buildbusd() {
        exchange.setSusd(36.12);
    }

    @Override
    void buildseur() {
        exchange.setBeur(40.15);
    }

    @Override
    void buildbeur() {
        exchange.setSeur(35.34);
    }
}
