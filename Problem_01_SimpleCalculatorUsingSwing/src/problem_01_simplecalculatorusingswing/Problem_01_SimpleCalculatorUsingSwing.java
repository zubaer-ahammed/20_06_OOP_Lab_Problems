/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem_01_simplecalculatorusingswing;

/**
 *
 * @author zubaer
 */
public class Problem_01_SimpleCalculatorUsingSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }
    
}
