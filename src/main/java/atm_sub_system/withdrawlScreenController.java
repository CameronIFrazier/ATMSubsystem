package atm_sub_system;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
public class withdrawlScreenController {
    @FXML
    private Label insertAmountWithdrawlLabel;

    @FXML
    private TextField withdrawlAmountTextField;

    @FXML
    private void withdrawl() throws IOException {
        String input = withdrawlAmountTextField.getText();

        try{
            int withdrawledAmount = Integer.parseInt(input);
            
            int newBalance = App.balance.get() - withdrawledAmount;
            App.balance.set(newBalance);

            //  update the screen
            insertAmountWithdrawlLabel.setText("withdrawled $" + withdrawledAmount);

            // Clear input field
            withdrawlAmountTextField.clear();
        }
        catch (NumberFormatException e){
            insertAmountWithdrawlLabel.setText("Invalid amount!");
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}
