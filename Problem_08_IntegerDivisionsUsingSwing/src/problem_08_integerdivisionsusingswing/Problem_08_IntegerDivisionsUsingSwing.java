package problem_08_integerdivisionsusingswing;

/**
 *
 * @author zubaer
 */
public class Problem_08_IntegerDivisionsUsingSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IntegerDivisions().setVisible(true);
            }
        
        });
        
    }
    
}
