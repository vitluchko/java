/**
 * Director class
 * @author Vitaliy
 * @version 1.1
 * @see BuildUserRunner
 */
public class Director {
    ExchangeBuilder builder;

    public void setBuilder(ExchangeBuilder builder) {
        this.builder = builder;
    }

    Exchange buildExchange(){
        builder.createExchange();
        builder.buildbusd();
        builder.buildsusd();
        builder.buildbeur();
        builder.buildseur();

        Exchange exchange = builder.getExchange();

        return exchange;
    }
}
