package problem_02_primenumbers;

import java.util.Scanner;

/**
 *
 * @author zubaer
 */
public class Problem_02_PrimeNumbers {

    public static boolean isPrime(int number) {
        
        boolean isPrime = true;

        for(int j=2; j<=number/2; j++) {

            if(number%j == 0) {
                isPrime = false;
            }

        }

        return isPrime;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number upto which you want to find prime numbers: ");
        int n = scanner.nextInt();
        
        System.out.printf("The prime numbers from 1 to %d are: ", n);
        for(int number=2; number<=n; number++) {
         
            boolean isPrime = isPrime(number);
            if(isPrime) {
                System.out.print(number+" ");
            }
            
        }
        
        System.out.println("\n");
        
        
    }
    
}
