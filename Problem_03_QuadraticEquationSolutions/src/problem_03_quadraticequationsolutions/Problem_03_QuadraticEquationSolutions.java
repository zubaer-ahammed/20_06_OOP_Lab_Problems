package problem_03_quadraticequationsolutions;

import java.util.Scanner;

/**
 * ID: 20052801006
 * @author zubaer
 */
public class Problem_03_QuadraticEquationSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();
        
        double d = b*b - 4.0*a*c; //discriminant (d)
        
        if(d>0) {
            
            double r1 = (-b + Math.sqrt(d)) / (2.0*a);
            double r2 = (-b - Math.sqrt(d)) / (2.0*a);

            System.out.println("The roots are real and different. The roots are "+r1+" and "+r2);
            
        } else if(d==0) {
            
            double r1 = (-b + Math.sqrt(d)) / (2.0*a); //or, r1 = -b / (2.0 * a); as d=0
            System.out.println("The roots are real and same. The roots are "+r1+" and "+r1);
            
        } else {
            System.out.println("Roots are not real.");
        }
        
    }
    
}
