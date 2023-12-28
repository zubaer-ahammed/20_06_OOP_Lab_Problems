package problem_08_integerdivisions;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

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
   
    
    @FXML
    private void handleDevideButtonAction(ActionEvent event) {
        System.out.println("Divide!");
        
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());      
            
            try {
                double calculation_result = num1 / num2;
                result.setText(String.valueOf( calculation_result) );
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                Alert alert = new Alert(Alert.AlertType.INFORMATION, e.getMessage(), ButtonType.OK);
                alert.setTitle("ArithmeticException");
                alert.setHeaderText("Division by Zero");
                //alert.setContentText("Error Message: "+e.getMessage());
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
            }
            
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, e.getMessage(), ButtonType.OK);
            alert.setTitle("NumberFormatException");
            alert.setHeaderText("NumberFormatException");
            alert.setContentText("Either Number 1 or Number 2 were not an integer");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.show();
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
