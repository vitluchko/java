/**
 * Abstract class
 * @author Vitaliy
 * @version 1.1
 * @see SellExchange
 * @see BuyExchange
 */
public abstract class ExchangeBuilder {
    Exchange exchange;

    void createExchange() {
        exchange = new Exchange();
    }

    abstract void buildsusd();

    abstract void buildbusd();

    abstract void buildseur();

    abstract void buildbeur();

    Exchange getExchange() {
        return exchange;
    }
}
