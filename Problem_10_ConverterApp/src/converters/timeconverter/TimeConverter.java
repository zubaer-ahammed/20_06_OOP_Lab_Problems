package converters.timeconverter;

/**
 *
 * @author zubaer
 */
public class TimeConverter {
    
    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public int minutesToHours(int minutes) {
        return minutes / 60;
    }

    public int hoursToSeconds(int hours) {
        return hours * 3600;
    }

    public int secondsToHours(int seconds) {
        return seconds / 3600;
    }
    
}
