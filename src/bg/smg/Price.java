package bg.smg;


public class Price implements Cloneable {
    private double value;
    private PriceCurrency currency;

    public Price(double value, PriceCurrency currency) {
        this.value = value;
        this.currency = currency;
    }

    public Price() {
        this.value = 0;
        this.currency = PriceCurrency.BGN;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public PriceCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(PriceCurrency currency) {
        this.currency = currency;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
