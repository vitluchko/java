import java.util.Objects;

/**
 * Main class
 *
 * @author Vitaliy
 * @version 1.1
 * @see ExchangeBuilder
 */
public class Exchange {
    /**
     * Parameters
     */
    private double busd;
    private double susd;
    private double beur;
    private double seur;

    public void setBusd(double busd) {
        this.busd = busd;
    }

    public void setSusd(double susd) {
        this.susd = susd;
    }

    public void setBeur(double beur) {
        this.beur = beur;
    }

    public void setSeur(double seur) {
        this.seur = seur;
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
        if (!(o instanceof Exchange)) return false;
        Exchange exchange = (Exchange) o;
        return Double.compare(exchange.busd, busd) == 0 && Double.compare(exchange.susd, susd) == 0 && Double.compare(exchange.beur, beur) == 0 && Double.compare(exchange.seur, seur) == 0;
    }

    /**
     * hashcode
     *
     * @return hash objects
     */
    @Override
    public int hashCode() {
        return Objects.hash(busd, susd, beur, seur);
    }

    /**
     * Method toString()
     *
     * @return string with full information about exchange
     */
    @Override
    public String toString() {
        return "Exchange{" +
                "busd=" + busd +
                ", susd=" + susd +
                ", beur=" + beur +
                ", seur=" + seur +
                '}';
    }
}
