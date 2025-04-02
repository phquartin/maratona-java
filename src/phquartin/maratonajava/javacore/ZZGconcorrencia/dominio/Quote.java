package phquartin.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Quote {
    private final String strore;
    private final double price;
    private final Discount.Code code;

    private Quote(String strore, double price, Discount.Code code) {
        this.strore = strore;
        this.price = price;
        this.code = code;
    }

    /**
     * Creates new Quote from the value following the pattern storeName:price:discount
     *
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value){
        String[] split = value.split(":");
        return new Quote(split[0], Double.parseDouble(split[1]), Discount.Code.valueOf(split[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "strore='" + strore + '\'' +
                ", price=" + price +
                ", code=" + code +
                '}';
    }

    public String getStrore() {
        return strore;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getCode() {
        return code;
    }
}
