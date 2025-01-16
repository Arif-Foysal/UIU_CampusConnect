module com.example.uiu_campusconnect {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.uiu_campusconnect to javafx.fxml;
    exports com.example.uiu_campusconnect;
}