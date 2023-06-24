package com.example.jacobcapstone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BarchartController implements Initializable {
    public Button backbutton;
    public BarChart barchart;

    public void bartomain(ActionEvent actionEvent) throws IOException {
        Parent bartoMain= FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        Scene scene = new Scene(bartoMain);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        barchart.setTitle("Average Engineer Salaries");
        XYChart.Series series= new XYChart.Series();
        series.setName("salary based on average years of experience");
        series.getData().add(new XYChart.Data("1",41093));
        series.getData().add(new XYChart.Data("2",46686));
        series.getData().add(new XYChart.Data("3",59889.4));
        series.getData().add(new XYChart.Data("4",59776.2));
        series.getData().add(new XYChart.Data("5",76826.66));
        series.getData().add(new XYChart.Data("6",92839));
        series.getData().add(new XYChart.Data("7",99787.5));
        series.getData().add(new XYChart.Data("8",111621.5));
        series.getData().add(new XYChart.Data("9",111728.66));
        series.getData().add(new XYChart.Data("10",122131.5));
        barchart.getData().add(series);
    }
}
