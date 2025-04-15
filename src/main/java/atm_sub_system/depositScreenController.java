package atm_sub_system;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
public class depositScreenController {
    @FXML
    private Label insertAmountDepositLabel;

    @FXML
    private TextField depositAmountTextField;

    @FXML
    private void deposit() throws IOException {
        String input = depositAmountTextField.getText();

        try{
            int depositedAmount = Integer.parseInt(input);
            
            int newBalance = depositedAmount + App.balance.get();
            App.balance.set(newBalance);

            //  update the screen
            insertAmountDepositLabel.setText("Deposited $" + depositedAmount);

            // Clear input field
            depositAmountTextField.clear();
        }
        catch (NumberFormatException e){
            insertAmountDepositLabel.setText("Invalid amount!");
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}
