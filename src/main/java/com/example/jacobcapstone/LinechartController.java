package com.example.jacobcapstone;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;


public class LinechartController implements Initializable {
    public LineChart linechart;
    public Button linebackbutton;



    public void linetomain(ActionEvent actionEvent) throws IOException {
        Parent linetoMain= FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        Scene scene = new Scene(linetoMain);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        linechart.setTitle("Engineers Salaries");
        XYChart.Series series= new XYChart.Series();
        series.setName("Salary based on years of experience");
        series.getData().add(new XYChart.Data("1.1",39343));
        series.getData().add(new XYChart.Data("1.3",46205));
        series.getData().add(new XYChart.Data("1.5",37731));
        series.getData().add(new XYChart.Data("2.0",43525));
        series.getData().add(new XYChart.Data("2.2",39891));
        series.getData().add(new XYChart.Data("2.9",56642));
        series.getData().add(new XYChart.Data("3.0",60150));
        series.getData().add(new XYChart.Data("3.2",54445));
        series.getData().add(new XYChart.Data("3.2",64445));
        series.getData().add(new XYChart.Data("3.7",57189));
        series.getData().add(new XYChart.Data("3.9",63218));
        series.getData().add(new XYChart.Data("4.0",55794));
        series.getData().add(new XYChart.Data("4.0",56957));
        series.getData().add(new XYChart.Data("4.1",57081));
        series.getData().add(new XYChart.Data("4.5",61111));
        series.getData().add(new XYChart.Data("4.9",67938));
        series.getData().add(new XYChart.Data("5.1",66029));
        series.getData().add(new XYChart.Data("5.3",83088));
        series.getData().add(new XYChart.Data("5.9",81363));
        series.getData().add(new XYChart.Data("6.0",93940));
        series.getData().add(new XYChart.Data("6.8",91738));
        series.getData().add(new XYChart.Data("7.1",98273));
        series.getData().add(new XYChart.Data("7.9",101302));
        series.getData().add(new XYChart.Data("8.2",113812));
        series.getData().add(new XYChart.Data("8.7",109431));
        series.getData().add(new XYChart.Data("9.0",105582));
        series.getData().add(new XYChart.Data("9.5",116969));
        series.getData().add(new XYChart.Data("9.6",112635));
        series.getData().add(new XYChart.Data("10.3",122391));
        series.getData().add(new XYChart.Data("10.5",121872));


        linechart.getData().add(series);

    }
}

    