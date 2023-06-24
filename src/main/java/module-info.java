module com.example.jacobcapstone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jacobcapstone to javafx.fxml;
    exports com.example.jacobcapstone;
}