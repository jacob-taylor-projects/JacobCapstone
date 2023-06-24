package com.example.jacobcapstone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.jacobcapstone.LinearRegression.predictForSalary;

public class SalaryPredicterController {
    public TextField yearsofExperience;
    public Button submitbutton;
    public TextField estsalary;




    public void salarytoMain(ActionEvent actionEvent) throws IOException {
        Parent salarytoMain= FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        Scene scene = new Scene(salarytoMain);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void estimateSalary(ActionEvent actionEvent) {
        double years=getDoubleFromTextField(yearsofExperience);
        double salary = predictForSalary(years);
        estsalary.setText(String.valueOf(salary));
    }
    public static double getDoubleFromTextField(TextField textField) {
        String text = textField.getText();
        return Double.parseDouble(text);
    }
}
