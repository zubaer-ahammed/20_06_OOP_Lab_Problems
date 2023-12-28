package converters.distanceconverter;

/**
 *
 * @author zubaer
 */
public class DistanceConverter {
    
    public double meterToKilometer(double meters) {
        return meters / 1000.0;
    }

    public double kilometerToMeter(double kilometers) {
        return kilometers * 1000.0;
    }

    public double milesToKilometer(double miles) {
        return miles * 1.60934;
    }

    public double kilometerToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    
}
