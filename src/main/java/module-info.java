module com.example.twoeurocoins {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.twoeurocoins to javafx.fxml;
    exports com.example.twoeurocoins;
}