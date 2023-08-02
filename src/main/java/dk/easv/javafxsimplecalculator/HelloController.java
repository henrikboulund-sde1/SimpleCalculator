package dk.easv.javafxsimplecalculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private Operator operator = null;

    @FXML
    private Button btnCalculate;

    @FXML
    private Label lblOperator;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtValue1;

    @FXML
    private TextField txtValue2;

    @FXML
    private void onClickCalculate(ActionEvent actionEvent) {
        int value1 = Integer.parseInt(txtValue1.getText());
        int value2 = Integer.parseInt(txtValue2.getText());
        int result = 0;
        if(operator == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "You have not selected any operator.");
            alert.show();
        }
        else {
            switch(operator)
            {
                case Addition -> result = value1 + value2;

                case Subtraction -> result = value1 - value2;

                case Multipication -> result = value1 * value2;

                case Divide -> result = value1 / value2;
            }
            lblResult.setText(String.valueOf(result));
            lblResult.setVisible(true);
        }
    }

    public void onClickAddition(ActionEvent actionEvent) {
        operator = Operator.Addition;
        lblOperator.setText("+");
    }

    public void onClickSubtraction(ActionEvent actionEvent) {
        operator = Operator.Subtraction;
        lblOperator.setText("-");
    }

    public void onClickMultiplication(ActionEvent actionEvent) {
        operator = Operator.Multipication;
        lblOperator.setText("X");
    }

    public void onClickDivide(ActionEvent actionEvent) {
        operator = Operator.Divide;
        lblOperator.setText("/");
    }
}

 enum Operator
{
    Addition,
    Subtraction,
    Multipication,
    Divide
}