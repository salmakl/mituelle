module com.example.brief3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.brief3 to javafx.fxml;
    exports com.example.brief3;
}