module com.example.customcontrols2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customcontrols2 to javafx.fxml;
    exports com.example.customcontrols2;
}