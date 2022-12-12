/**
 * Sell template
 *
 * @author Vitaliy
 * @version 1.1
 */
public class SellExchange extends ExchangeBuilder{
    @Override
    void buildsusd() {
        exchange.setBusd(36.42);
    }

    @Override
    void buildbusd() {
        exchange.setSusd(39.45);
    }

    @Override
    void buildseur() {
        exchange.setBeur(35.02);
    }

    @Override
    void buildbeur() {
        exchange.setSeur(38.35);
    }
}
