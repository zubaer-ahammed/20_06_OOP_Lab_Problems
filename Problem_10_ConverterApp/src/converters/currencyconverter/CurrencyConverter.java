package converters.currencyconverter;

/**
 *
 * @author zubaer
 */
public class CurrencyConverter {

    private final double dollar_to_bdt_rate = 109.79;
    private final double euro_to_bdt_rate = 121.98;
    private final double yen_to_bdt_rate = 0.78;
    
    public double dollarToBDT(double dollars) {
        return dollars * dollar_to_bdt_rate;
    }

    public double euroToBDT(double euros) {
        return euros * euro_to_bdt_rate;
    }

    public double yenToBDT(double yen) {
        return yen * yen_to_bdt_rate;
    }

    public double BDTToDollar(double bdt) {
        return bdt / dollar_to_bdt_rate;
    }

    public double BDTToEuro(double bdt) {
        return bdt / euro_to_bdt_rate;
    }

    public double BDTToYen(double bdt) {
        return bdt / yen_to_bdt_rate;
    }
    
    
}
