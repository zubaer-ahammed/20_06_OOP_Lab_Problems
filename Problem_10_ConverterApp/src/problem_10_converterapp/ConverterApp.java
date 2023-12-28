package problem_10_converterapp;

import converters.currencyconverter.*;
import converters.distanceconverter.*;
import converters.timeconverter.*;
import java.util.Scanner;

/**
 *
 * @author zubaer
 */
public class ConverterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();
        
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Currency Conversion");
            System.out.println("2. Distance Conversion");
            System.out.println("3. Time Conversion");
            System.out.println("4. Exit");

            System.out.print("\nChoice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currencyConversionMenu(currencyConverter, scanner);
                    break;
                case 2:
                    distanceConversionMenu(distanceConverter, scanner);
                    break;
                case 3:
                    timeConversionMenu(timeConverter, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    private static void currencyConversionMenu(CurrencyConverter converter, Scanner scanner) {
        
        System.out.println("Currency Conversion Options:");
        System.out.println("1. Dollar to BDT");
        System.out.println("2. Euro to BDT");
        System.out.println("3. Yen to BDT");
        System.out.println("4. BDT to Dollar");
        System.out.println("5. BDT to Euro");
        System.out.println("6. BDT to Yen");
        System.out.println("7. Back to main menu");

        System.out.print("\nChoice: ");
        int choice = scanner.nextInt();

        double amount;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in Dollars: ");
                amount = scanner.nextDouble();
                result = converter.dollarToBDT(amount);
                System.out.println("Result: " + result + " BDT");
                break;
            case 2:
                System.out.print("Enter the amount in Euros: ");
                amount = scanner.nextDouble();
                result = converter.euroToBDT(amount);
                System.out.println("Result: " + result + " BDT");
                break;
            case 3:
                System.out.print("Enter the amount in Yen: ");
                amount = scanner.nextDouble();
                result = converter.yenToBDT(amount);
                System.out.println("Result: " + result + " BDT");
                break;
            case 4:
                System.out.print("Enter the amount in BDT: ");
                amount = scanner.nextDouble();
                result = converter.BDTToDollar(amount);
                System.out.println("Result: " + result + " Dollars");
                break;
            case 5:
                System.out.print("Enter the amount in BDT: ");
                amount = scanner.nextDouble();
                result = converter.BDTToEuro(amount);
                System.out.println("Result: " + result + " Euros");
                break;
            case 6:
                System.out.print("Enter the amount in BDT: ");
                amount = scanner.nextDouble();
                result = converter.BDTToYen(amount);
                System.out.println("Result: " + result + " Yen");
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        
    }

    private static void distanceConversionMenu(DistanceConverter converter, Scanner scanner) {
        
        System.out.println("Distance Conversion Options:");
        System.out.println("1. Meter to Kilometer");
        System.out.println("2. Kilometer to Meter");
        System.out.println("3. Miles to Kilometer");
        System.out.println("4. Kilometer to Miles");
        System.out.println("5. Back to main menu");

        System.out.print("\nChoice: ");
        int choice = scanner.nextInt();

        double distance;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter the distance in Meters: ");
                distance = scanner.nextDouble();
                result = converter.meterToKilometer(distance);
                System.out.println("Result: " + result + " Kilometers");
                break;
            case 2:
                System.out.print("Enter the distance in Kilometers: ");
                distance = scanner.nextDouble();
                result = converter.kilometerToMeter(distance);
                System.out.println("Result: " + result + " Meters");
                break;
            case 3:
                System.out.print("Enter the distance in Miles: ");
                distance = scanner.nextDouble();
                result = converter.milesToKilometer(distance);
                System.out.println("Result: " + result + " Kilometers");
                break;
            case 4:
                System.out.print("Enter the distance in Kilometers: ");
                distance = scanner.nextDouble();
                result = converter.kilometerToMiles(distance);
                System.out.println("Result: " + result + " Miles");
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        
    }

    private static void timeConversionMenu(TimeConverter converter, Scanner scanner) {
        
        System.out.println("Time Conversion Options:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.println("3. Hours to Seconds");
        System.out.println("4. Seconds to Hours");
        System.out.println("5. Back to main menu");

        System.out.print("\nChoice: ");
        int choice = scanner.nextInt();

        int time;
        int result;

        switch (choice) {
            case 1:
                System.out.print("Enter the time in Hours: ");
                time = scanner.nextInt();
                result = converter.hoursToMinutes(time);
                System.out.println("Result: " + result + " Minutes");
                break;
            case 2:
                System.out.print("Enter the time in Minutes: ");
                time = scanner.nextInt();
                result = converter.minutesToHours(time);
                System.out.println("Result: " + result + " Hours");
                break;
            case 3:
                System.out.print("Enter the time in Hours: ");
                time = scanner.nextInt();
                result = converter.hoursToSeconds(time);
                System.out.println("Result: " + result + " Seconds");
                break;
            case 4:
                System.out.print("Enter the time in Seconds: ");
                time = scanner.nextInt();
                result = converter.secondsToHours(time);
                System.out.println("Result: " + result + " Hours");
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        
    }
        

    
}
