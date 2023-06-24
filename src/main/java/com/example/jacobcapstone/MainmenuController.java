package com.example.jacobcapstone;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainmenuController {
    public Button exitbutton;
    Stage stage;
    public Button barchartbutton;
    public Button linechartbutton;
    public Button piechartbutton;

    public void gotobarchart(ActionEvent actionEvent) throws IOException {
        Parent barchart = FXMLLoader.load(getClass().getResource("jacobbarchart.fxml"));
        Scene scene = new Scene(barchart);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void gotolinechart(ActionEvent actionEvent) throws IOException {
        Parent linechart = FXMLLoader.load(getClass().getResource("JacobLinechart.fxml"));
        Scene scene = new Scene(linechart);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    public void gotopiechart(ActionEvent actionEvent) throws IOException {
        Parent piechart= FXMLLoader.load(getClass().getResource("jacobscatterchart.fxml"));
        Scene scene = new Scene(piechart);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void exitscene(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void gotopredictor(ActionEvent actionEvent) throws IOException {
        Parent predicter= FXMLLoader.load(getClass().getResource("SalaryPredicter.fxml"));
        Scene scene = new Scene(predicter);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}