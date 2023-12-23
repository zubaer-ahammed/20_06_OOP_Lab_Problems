package problem_01_simplecalculator;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author zubaer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private TextField result;
    
    private DecimalFormat f = new DecimalFormat("##.0000");
    
    @FXML
    private void handleAddAction(ActionEvent event) {
        System.out.println("Add!");
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double calculation_result = num1 + num2;
        result.setText(String.valueOf( f.format(calculation_result)) );
    }
    
    @FXML
    private void handleSubtractAction(ActionEvent event) {
        System.out.println("Subtract!");
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double calculation_result = num1 - num2;
        result.setText(String.valueOf( f.format(calculation_result)) );
    }
    
    @FXML
    private void handleMultiplyAction(ActionEvent event) {
        System.out.println("Multiply!");
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double calculation_result = num1 * num2;
        result.setText(String.valueOf( f.format(calculation_result)) );
        
    }
    
    @FXML
    private void handleModulusAction(ActionEvent event) {
        System.out.println("Modulus!");
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double calculation_result = num1 % num2;
        result.setText(String.valueOf( f.format(calculation_result)) );
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
